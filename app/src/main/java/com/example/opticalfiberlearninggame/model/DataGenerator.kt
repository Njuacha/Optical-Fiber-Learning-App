package com.example.opticalfiberlearninggame.model

class DataGenerator {
    companion object {
        fun getQuestions(): List<Question> {
            return listOf(
                Question(1, "Why is John happy today?"),
                Question(2, "Why is John happy today?"),
                Question(3, "Why is John happy today?")
            )
        }

        fun getAnswers(): List<Answer> {
            return listOf(
                Answer(1, 1, false, "Because today is Sunday."),
                Answer(2, 1, true, "He is happy because he ate fried chicken."),
                Answer(3, 1, false, "Today is his birthday."),
                Answer(4, 1, false, "Sorry I am lost here, But who is John?"),

                Answer(5, 2, false, "Because today is Sunday."),
                Answer(6, 2, true, "He is happy because he ate fried chicken."),
                Answer(7, 2, false, "Today is his birthday."),
                Answer(8, 2, false, "Sorry I am lost here, But who is John?"),

                Answer(9, 3, false, "Because today is Sunday."),
                Answer(10, 3, true, "He is happy because he ate fried chicken."),
                Answer(11, 3, false, "Today is his birthday."),
                Answer(12, 3, false, "Sorry I am lost here, But who is John?")
            )
        }
    }
}