package com.example.opticalfiberlearninggame.model

class DataGenerator {
    companion object {
        fun getQuestions(): List<Question> {
            return listOf(
                // topic 1 questions
                Question(1, 1,"According to the modern theory concerning atoms, who does it move in orbits around the nucleus? ", null),
                Question(2, 1,"All photons travel at the speed of:  ", null),
                Question(3, 1,"c is the speed of light with a constant value of: ", null ),
                Question(4, 1, "h is Planck’s constant with a value of: ", null),
                // topic 2 questions
                Question(5,2,"Choose a transparent material which we can use to transmit light in order to send information.", null),
                Question(6,2,"It is true that the speed of light in a transparent material:", null),
                Question(7,2,"A ray of light in a material of refractive index 1.44 is reaching a material with a refractive index of 1.42. At the boundary the critical angle is:", null),
                Question(8,2,"If the light approaches the boundary at an angle greater than the critical angle, then…", null),
                Question(9,2,"What does TIR stand for? ", null),
                Question(10,2,"The refractive index in the cladding is always:", null),
                Question(11,2, "The angle in the following figure has a value of: ", "fig1.jpg")
            )
        }

        fun getAnswers(): List<Answer> {
            return listOf(
                // topic 1 answers
                Answer(1, 1, true, "Electrons."),
                Answer(2, 1, false, "Protons."),
                Answer(3, 1, false, "Neutrons."),
                Answer(4, 1, false, "Photons."),

                Answer(5, 2, false, "Sound."),
                Answer(6, 2, true, "Light."),
                Answer(7, 2, false, "Sound in vacuum."),
                Answer(8, 2, false, "None of the above."),

                Answer(9, 3, true, "300.000 Km/s"),
                Answer(10, 3, false, "340 m/s"),
                Answer(11, 3, false, "1440 m/s"),
                Answer(12, 3, false, "5000 m/s"),

                Answer(13, 4, false, "9.1 x 10-31 Kg."),
                Answer(14, 4, false, "1.6 x 10-19 C."),
                Answer(15, 4, false, "8.85 x 10-12 F/m."),
                Answer(16, 4, true, "6.63 x 10-34 J-sec."),

                // topic 2 answers
                Answer(17, 5, false, "Water."),
                Answer(18, 5, false, "Coal."),
                Answer(19, 5, true, "Optic Fiber."),
                Answer(20, 5, false, "Silicon"),

                Answer(21, 6, false, "Is greater that the speed of light in vacuum. "),
                Answer(22, 6, true, "Is always slower than in vacuum."),
                Answer(23, 6, false, "Is equal than the speed of light in free space."),
                Answer(24, 6, false, "Does not depend on the material."),

                Answer(25, 7, true, "80.44°"),
                Answer(26, 7, false, "90°"),
                Answer(27, 7, false, "76.55°"),
                Answer(28, 7, false, "12.33°"),

                Answer(29, 8, false, "The ray is refracted in the new material. "),
                Answer(30,  8,false, "The ray extinguishes."),
                Answer(31,  8,true, "The light is actually reflected from the boundary region back into the first material."),
                Answer(32, 8, false, "None of the above."),

                Answer(33, 9, false, "Technical Interface Requirement."),
                Answer(34, 9, false, "Total Incident Reflection."),
                Answer(35, 9, false, "Total Internal Refraction."),
                Answer(36, 9, true, "Total Internal Reflection."),

                Answer(37, 10, true, "Lower than the refractive index of the core."),
                Answer(38, 10, false, "Higher than the refractive index of the core."),
                Answer(39, 10,false, "Equal than the refractive index of the core."),
                Answer(40, 10, false, "None of the above."),

                Answer(41, 11, false, "48.59°"),
                Answer(42, 11, true, "45°"),
                Answer(43, 11, false, "50°"),
                Answer(44, 11, false, "60°")



            )
        }

        fun getTopics(): List<Topic> {
            return listOf(
                Topic(1, "Basics of light"),
                Topic(2, "Intro to optical fiber"),
                Topic(3, "Fiber Optic Transmitter"),
                Topic(4, "Fiber Optic Receiver"),
                Topic(5, "Long Distances Optical Fiber"),
                Topic(6, "Optical Fiber Networks"),
                Topic(7, "Optical Interconnection and Tools")
            )
        }
    }
}