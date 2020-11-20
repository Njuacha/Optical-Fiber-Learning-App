package com.example.opticalfiberlearninggame.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import java.util.concurrent.Executors

@Database(entities = [Answer::class, Question::class], version = 1)
public abstract class AppDatabase : RoomDatabase() {

    abstract fun answerDao(): AnswerDao
    abstract fun questionDao(): QuestionDao



    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "optics_app_database"
                ).addCallback(object : RoomDatabase.Callback() {

                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        // pre populate database
                        Executors.newSingleThreadExecutor().execute {
                            INSTANCE?.let {
                                it.questionDao().deleteAll()
                                it.answerDao().deleteAll()
                                it.questionDao().insertQuestions(DataGenerator.getQuestions())
                                it.answerDao().insertAnswers(DataGenerator.getAnswers())
                            }
                        }
                    }


                }).build()
                INSTANCE = instance

                // return instance
                instance
            }
        }
    }

}