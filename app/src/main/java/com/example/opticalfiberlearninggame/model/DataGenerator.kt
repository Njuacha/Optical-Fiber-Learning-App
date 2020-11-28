package com.example.opticalfiberlearninggame.model

class DataGenerator {
    companion object {
        fun getQuestions(): List<Question> {
            return listOf(
                Question(1, 1,"Choose a transparent material which we can use to transmit light in order to send information."),
                Question(2, 1,"Generally, an optic fiber is made of: "),
                Question(3, 1,"It is true that: "),
                Question(4, 1, "It is true that plastic optic fibers: ")
            )
        }

        fun getAnswers(): List<Answer> {
            return listOf(
                Answer(1, 1, false, "Water."),
                Answer(2, 1, false, "Coal"),
                Answer(3, 1, true, "Optic Fiber"),
                Answer(4, 1, false, "Silicon"),

                Answer(5, 2, false, "Silicon."),
                Answer(6, 2, false, "Plastic."),
                Answer(7, 2, false, "Silica glass."),
                Answer(8, 2, true, "B & C are correct."),

                Answer(9, 3, true, "Plastic fiber is used for short distance communications."),
                Answer(10, 3, false, "Silica glass is not used because of its clarity."),
                Answer(11, 3, false, "Optic fiber was invented to replace copper cables."),
                Answer(12, 3, false, "Copper coaxial cables are capable of carrying light over long distances."),

                Answer(13, 4, false, "Are used for long distance communications."),
                Answer(14, 4, true, "Have higher losses than glass fiber."),
                Answer(15, 4, false, "Are not used in the automobile industry."),
                Answer(16, 4, false, "All the above.")
            )
        }

        fun getTopics(): List<Topic> {
            return listOf(
                Topic(1, "Basics of Optic fiber and Light"),
                Topic(2, "Fiber optic Transmitter and Receiver"),

                Topic(3, "Long Distances and Fiber Network"),
                Topic(4, "Optical Interconnection and Tools")
            )
        }
    }
}