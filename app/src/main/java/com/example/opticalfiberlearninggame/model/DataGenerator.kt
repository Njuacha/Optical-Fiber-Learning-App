package com.example.opticalfiberlearninggame.model

class DataGenerator {
    companion object {
        fun getQuestions(): List<Question> {
            return listOf(
                // topic 1
                Question(1, 1,"According to the modern theory concerning atoms, who moves in orbits around the nucleus? ", null),
                Question(2, 1,"All photons travel at the speed of:  ", null),
                Question(3, 1,"c is the speed of light in vacuum with a constant value of:", null ),
                Question(4, 1, "h is Planck’s constant with a value of: ", null),
                // topic 2
                Question(5,2,"Choose a transparent material which we can use to transmit light in order to send information.", null),
                Question(6,2,"It is true that the speed of light in a transparent material:", null),
                Question(7,2,"A ray of light in a material of refractive index 1.44 is reaching a material with a refractive index of 1.42. At the boundary the critical angle is:", null),
                Question(8,2,"If the light approaches the boundary at an angle greater than the critical angle, then…", null),
                Question(9,2,"What does TIR stand for? ", null),
                Question(10,2,"The refractive index in the cladding is always:", null),
                Question(11,2, "The angle in the following figure has a value of: ", "file:///android_asset/images/d1.jpeg"),
                Question(12,2, "What are the main primary types of fiber?",null),
                Question(13,2, "Light loss during transmission is called:",null),
                // topic 3
                Question(14,3, "Most of the early work in fiber optics was done at optical wavelengths between:",null),
                Question(15,3, "What are the most common light sources used in fiber transmitters? ",null),
                Question(16,3, "In which types of communication LED is used as light sources? ",null),
                Question(17,3, "In which types of application LED is used as light sources? ",null),
                Question(18,3, "Laser diodes are used as light sources for:",null),
                Question(19,3, "Laser diodes are used as light sources for: ",null),
                Question(20,3, "LEDs emit light:",null),
                Question(21,3, "Some advantages of LEDs:",null),
                Question(22,3, "Some advantages of using laser diodes:",null),
                Question(23,3, "Laser diodes emit light:",null),
                Question(24,3, "What is called “lasing”?",null),
                // topic 4
                Question(25,4, "The fiber optic receiver convert light into:",null),
                Question(26,4, "The most important element of a fiber optic receiver is: ",null),
                Question(27,4, "The photodetector converts optical energy into:",null),
                Question(28,4, "It is a main photodetector type:",null),
                Question(29,4, "Light rays (photons) which comes from the transmitter via optical fiber are absorbed by:",null),
                Question(30,4, "Most popular detectors of fiber optics are:",null),
                Question(31,4, "An advantage of photodiodes:",null),
                Question(32,4, "It is a specialized designed photodiode.",null),
                Question(33,4, "In an avalanche photodiode, a few photons produce:",null),
                Question(34,4, "Avalanche photodiodes are most often used in:",null),
                // topic 5
                Question(35,5, "To solve the problem of signal attenuation (strength loss) we use: ",null),
                Question(36,5, "In optical Networks, repeaters may be needed every:",null),
                Question(37,5, "There are two types of repeaters based on technologies: ",null),
                Question(38,5, "The most popular repeater type is: ",null),
                Question(39,5, "An electronic repeater converts the optical signal into electrical signal in order to: ",null),
                Question(40,5, "An optical amplifier takes a weak input optical signal and amplifies it into:", null),
                Question(41,5, "At this moment optical amplifier is:", null),
                Question(42,5, "Optical repeaters are dominant specially in:", null),
                Question(43,5, "In an optical amplifier, the light goes through the amplifier:", null),
                // topic 6
                Question(44,6, "In a Fiber Distributed Data Interface, the information passes through this system:", null),
                Question(45,6, "In a Fiber Distributed Data Interface system, one ring carries the information normally while the other is kept in reverse in case of:", null),
                // topic 7
                Question(46,7, "There are two primary methods to connect optical fiber:", null),
                Question(47,7, "This connector has stainless-steel structure and it is mainly used in high-power laser beams into large-core multimode fibers.", null),
                Question(48,7, "The typical insertion loss of an SMA connector is greater than:", null),
                Question(49,7, "This connector has high-precision and ceramic ferrule which allow both multimode and single mode fibers.", null),
                Question(50,7, "The insertion loss of the ST connector is less than:", null),
                Question(51,7, "This connector is mainly used in single-mode fibers like in fiber-optic instruments, SM fiber optic components, and in high-speed fiber optic communication links.", null),
                Question(52,7, "The typical insertion loss of the FC connector is around:", null),
                Question(53,7, "This connector is becoming increasingly popular in single-mode fiber optic telecom and analog CATV, field deployed links. Multimode versions of this connector are also available.", null),
                Question(54,7, "The typical insertion loss of the SC connector is around:", null),
                Question(55,7, "Losses in splices compared with losses in connectors are:", null),
                Question(56,7, "There are two methods of fiber optic splicing:", null),
                Question(57,7, "It is an alignment device, designed to hold the two fiber ends in a precisely aligned position thus enabling light to pass from one fiber into the other.", null),
                Question(58,7, "A machine is used to weld together the two fiber ends after alignment. This produces a continuous connection between the fibers enabling very low loss light transmission.", null),
                Question(59,7, "Fusion splicing works in:", null),
                Question(60,7, "Mechanical splicing works in:", null),
                Question(61,7, "How many steps are required in order to perform a mechanical splice? ", null),
                Question(62,7, "What is the first step to perform a mechanical splice? ", null),
                Question(63,7, "In what step the index matching gel inside the mechanical splice apparatus will help couple the light from one fiber end to the other? ", null),
                Question(64,7, "In fusion splicing, by using a good cleaver, we can produce a cleave angle of:", null),
                Question(65,7, "When fusing the fiber, there are two steps:", null),
                Question(66,7, "In fusion splicing, a fusion has a tensile strength between:", null),
                Question(67,7, "In splicing, all particles are not visible to the open eyes, that’s why:", null),
                Question(68,7, "In mechanical splicing, we need the proper angle on the end otherwise:", null),
                Question(69,7, "The two key factors for splicing are fusion time and fusion current:", null),
                Question(70,7, "To certify the performance of new fiber optics links and detect problems with existing fiber links we use:", null),
                Question(71,7, "OTDR is the most used technology in order to test fiber optic links such as:", null),
                Question(72,7, "A network operation can also be tested at a higher level with:", null),
                Question(73,7, "In an OTDR, a reflectometer sends a:", null),
                Question(74,7, "When there is a reflective fault such as mechanical connections, breaks or fiber ends, the OTDR indicates at these places:", null),
                Question(75,7, "For a quality OTDR trace:", null),
                Question(76,7, "The resulting OTDR is the ______ of the impulses sent to the line.", null)

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

                Answer(9, 3, true, "300.000.000 m/s"),
                Answer(10, 3, false, "299.705.543 m/s"),
                Answer(11, 3, false, "299.672.589 m/s"),
                Answer(12, 3, false, "228.849.205 m/s"),

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
                Answer(44, 11, false, "60°"),

                Answer(45, 12, false, "Glass fiber and plastic fiber."),
                Answer(46, 12, true, "Multi-mode and single-mode."),
                Answer(47, 12, false, "Transparent fiber and dark fiber."),
                Answer(48, 12, false, "None of the above."),

                Answer(49, 13, true, "Attenuation."),
                Answer(50, 13, false, "Power loss."),
                Answer(51, 13, false, "Absorption."),
                Answer(52, 13, false, "Scattering."),

                // topic 3 answers
                Answer(53, 14, false, "700nm – 800nm"),
                Answer(54, 14, true, "800nm – 900nm"),
                Answer(55, 14, false, "1300nm – 1500nm"),
                Answer(56, 14, false, "1500nm – 1600nm"),

                Answer(57, 15, false, "Incandescent bulbs and fluorescent light bulbs."),
                Answer(58, 15, true, "Light emitting diodes and laser diodes. "),
                Answer(59, 15, false, "Halogen bulbs and light emitting diodes. "),
                Answer(60, 15, false, "None of the above. "),

                Answer(61, 16, true, "Short-to-medium distances."),
                Answer(62, 16, false, "Short-to-long distances."),
                Answer(63, 16, false, "Medium-to-long distances."),
                Answer(64, 16, false, "Medium-to-high frequencies."),

                Answer(65, 17, false, "Medium-to-high frequencies."),
                Answer(66, 17, false, "Short-to-long distances."),
                Answer(67, 17, false, "Medium-to-long distances."),
                Answer(68, 17, true, "Short-to-medium frequencies."),

                Answer(69, 18, false, "Short-to-medium distances."),
                Answer(70, 18, false, "Short-to-long distances."),
                Answer(71, 18, true, "Medium-to-long distances."),
                Answer(72, 18, false, "Short-to-medium frequencies."),

                Answer(73, 19, false, "Short-to-medium distances."),
                Answer(74, 19, false, "Short-to-long distances."),
                Answer(75, 19, true, "Medium-to-high frequencies."),
                Answer(76, 19, false, "Short-to-medium frequencies."),

                Answer(77, 20, true, "Durable and cheap."),
                Answer(78, 20, false, "Size and availability."),
                Answer(79, 20, false, "Precision and longevity."),
                Answer(80, 20, false, "Absorbs energy easily."),

                Answer(81, 21, false, "Forward."),
                Answer(82, 21, false, "Backwards."),
                Answer(83, 21, false, "Upwards."),
                Answer(84, 21, true, "Randomly in all directions."),

                Answer(85, 22, false, "Lower speed than the LED diodes."),
                Answer(86, 22, false, "Lower efficiency of electrical-to-optical conversion."),
                Answer(87, 22, true, "Better optical output power than the LED."),
                Answer(88, 22, false, "Low costs."),

                Answer(89, 23, true, "Randomly in all directions."),
                Answer(90, 23, false, "Backwards."),
                Answer(91, 23, false, "Upwards."),
                Answer(92, 23, false, "Forward."),

                Answer(93, 24, false, "When current decrease at a certain level in laser diode then output light is suddenly much lower."),
                Answer(94, 24, true, "When current increase at a certain level in laser diode then output light is suddenly much higher."),
                Answer(95, 24, false, "When current increase at a certain level in laser diode then output light is suddenly much lower. "),
                Answer(96, 24, false, "When current decrease at a certain level in laser diode then output light is suddenly much higher."),

                // topic 4 answers
                Answer(97, 25, false, "Coded information."),
                Answer(98, 25, true, "Voltage."),
                Answer(99, 25, false, "Current."),
                Answer(100, 25, false, "Photons."),

                Answer(101, 26, true, "Photodetector."),
                Answer(102, 26, false, "Preamplifier."),
                Answer(103, 26, false, "Main amplifier."),
                Answer(104, 26, false, "Signal processor."),

                Answer(105, 27, false, "Voltage."),
                Answer(106, 27, false, "Light."),
                Answer(107, 27, false, "Coded information."),
                Answer(108, 27, true, "Electrical current."),

                Answer(109, 28, false, "Photodiode."),
                Answer(110, 28, false, "Phototransistor."),
                Answer(111, 28, false, "Photodarlington."),
                Answer(112, 28, true, "All the above."),

                Answer(113, 29, false, "Preamplifier."),
                Answer(114, 29, false, "Signal processor."),
                Answer(115, 29, true, "Photodetector."),
                Answer(116, 29, false, "Resistor."),

                Answer(117, 30, true, "Photodiodes."),
                Answer(118, 30, false, "Phototransistor."),
                Answer(119, 30, false, "Photodarlington."),
                Answer(120, 30, false, "Photoresistor."),

                Answer(121, 31, false, "Size."),
                Answer(122, 31, false, "Availability."),
                Answer(123, 31, true, "Price."),
                Answer(124, 31, false, "Durability."),

                Answer(125, 32, true, "Avalanche photodiode."),
                Answer(126, 32, false, "Phototransistor."),
                Answer(127, 32, false, "Photoresistor."),
                Answer(128, 32, false, "LED."),

                Answer(129, 33, false, "A few electrons and holes."),
                Answer(130, 33, false, "A few protons and holes."),
                Answer(131, 33, false, "Many neutrons and holes."),
                Answer(132, 33, true, "Many electrons and holes."),

                Answer(133, 34, false, "Short distance optical fiber system."),
                Answer(134, 34, false, "Medium distance optical fiber system."),
                Answer(135, 34, true, "Long distance optical fiber system."),
                Answer(136, 34, false, "All the above."),

                // topic 5 answers
                Answer(137, 35, false, "Transmitter."),
                Answer(138, 35, true, "Repeater."),
                Answer(139, 35, false, "Preamplifier."),
                Answer(140, 35, false, "Receiver."),

                Answer(141, 36, false, "1 Km."),
                Answer(142, 36, false, "5 Km."),
                Answer(143, 36, true, "50 Km."),
                Answer(144, 36, false, "100 Km."),

                Answer(145, 37, true, "Electronic and optical."),
                Answer(146, 37, false, "Electronic and magnetic."),
                Answer(147, 37, false, "Optical and magnetic."),
                Answer(148, 37, false, "Electronic and fiber."),

                Answer(149, 38, false, "Optical."),
                Answer(150, 38, false, "Fiber."),
                Answer(151, 38, true, "Electronic."),
                Answer(152, 38, false, "Magnetic."),

                Answer(153, 39, false, "Forward it."),
                Answer(154, 39, false, "Process it."),
                Answer(155, 39, false, "Decrease it."),
                Answer(156, 39, true, "Amplify it."),

                Answer(157, 40, true, "Optical signal."),
                Answer(158, 40, false, "Electrical signal."),
                Answer(159, 40, false, "Magnetic signal."),
                Answer(160, 40, false, "Logical signal."),

                Answer(161, 41, false, "Cheaper than electronic converter."),
                Answer(162, 41, true, "More expensive than electronic converter."),
                Answer(163, 41, false, "Same price than electronic converter."),
                Answer(164, 41, false, "Out of the market."),

                Answer(165, 42, false, "Short-distance communications."),
                Answer(166, 42, false, "Medium-distance communications."),
                Answer(167, 42, true, "Long-distance communications."),
                Answer(168, 42, false, "All the above."),

                Answer(169, 43, true, "Once."),
                Answer(170, 43, false, "Twice."),
                Answer(171, 43, false, "Multiple times."),
                Answer(172, 43, false, "None."),

                // topic 6 answers
                Answer(173, 44, false, "In one direction."),
                Answer(174, 44, true, "In both directions."),
                Answer(175, 44, false, "Clockwise direction."),
                Answer(176, 44, false, "Anticlockwise direction."),

                Answer(177, 45, true, "Component or cable failure."),
                Answer(178, 45, false, "Resend the information."),
                Answer(179, 45, false, "Robustness."),
                Answer(180, 45, false, "All the above."),

                // topic 7 answers
                Answer(181, 46, false, "Amplifiers and repeaters."),
                Answer(182, 46, false, "Electronic and optical."),
                Answer(183, 46, true, "Connectors and splices."),
                Answer(184, 46, false, "Photodiodes and phototransistors."),

                Answer(185, 47, true, "SMA."),
                Answer(186, 47, false, "ST."),
                Answer(187, 47, false, "FC."),
                Answer(188, 47, false, "SC."),

                Answer(189, 48, false, "0 dB"),
                Answer(190, 48, true, "1 dB"),
                Answer(191, 48, false, "2 dB"),
                Answer(192, 48, false, "3 dB"),

                Answer(193, 49, false, "SMA"),
                Answer(194, 49, true, "ST"),
                Answer(195, 49, false, "FC"),
                Answer(196, 49, false, "SC"),

                Answer(197, 50, true, "0.5 dB"),
                Answer(198, 50, false, "1 dB"),
                Answer(199, 50, false, "2 dB"),
                Answer(200, 50, false, "3 dB"),

                Answer(201, 51, false, "SMA."),
                Answer(202, 51, false, "ST."),
                Answer(203, 51, false, "SC."),
                Answer(204, 51, true, "FC."),

                Answer(205, 52, true, "0.3 dB"),
                Answer(206, 52, false, "0.5 dB"),
                Answer(207, 52, false, "0.8 dB"),
                Answer(208, 52, false, "1 dB"),

                Answer(209, 53, false, "SMA."),
                Answer(210, 53, false, "ST."),
                Answer(211, 53, true, "SC."),
                Answer(212, 53, false, "FC."),

                Answer(213, 54, true, "0.3 dB"),
                Answer(214, 54, false, "0.5 dB"),
                Answer(215, 54, false, "0.8 dB"),
                Answer(216, 54, false, "1 dB"),

                Answer(217, 55, false, "Very high"),
                Answer(218, 55, false, "High"),
                Answer(219, 55, false, "Equal"),
                Answer(220, 55, true, "Very low"),

                Answer(221, 56, true, "Fusion splicing & mechanical splicing."),
                Answer(222, 56, false, "Electrical splicing & mechanical splicing."),
                Answer(223, 56, false, "Optical splicing & magnetic splicing."),
                Answer(224, 56, false, "Electronic splicing & optical splicing."),

                Answer(225, 57, false, "Fusion splice."),
                Answer(226, 57, true, "Mechanical splice."),
                Answer(227, 57, false, "Optical splice."),
                Answer(228, 57, false, "Connector."),

                Answer(229, 58, true, "Fusion splice."),
                Answer(230, 58, false, "Mechanical splice."),
                Answer(231, 58, false, "Optical splice."),
                Answer(232, 58, false, "Connector."),

                Answer(223, 59, true, "Single mode."),
                Answer(234, 59, false, "Multimode."),
                Answer(235, 59, false, "Single mode and multimode."),
                Answer(236, 59, false, "Optical mode."),

                Answer(237, 60, false, "Single mode."),
                Answer(238, 60, false, "Multimode."),
                Answer(239, 60, true, "Single mode and multimode."),
                Answer(240, 60, false, "Optical mode."),

                Answer(241, 61, false, "3 Steps."),
                Answer(242, 61, true, "4 Steps."),
                Answer(243, 61, false, "5 Steps."),
                Answer(244, 61, false, "6 Steps."),

                Answer(245, 62, true, "Preparation of fiber."),
                Answer(246, 62, false, "Cleaving the fiber."),
                Answer(247, 62, false, "Mechanically join the fibers."),
                Answer(248, 62, false, "Protect the fiber."),

                Answer(249, 63, false, "Preparation of fiber."),
                Answer(250, 63, false, "Cleaving the fiber."),
                Answer(251, 63, true, "Mechanically join the fibers."),
                Answer(252, 63, false, "Protect the fiber."),

                Answer(253, 64, false, "3 degrees or less."),
                Answer(254, 64, false, "2 degrees or less."),
                Answer(255, 64, false, "1 degree or less."),
                Answer(256, 64, true, "0.5 degree or less."),

                Answer(247, 65, true, "Alignment and heating."),
                Answer(258, 65, false, "Cutting and heating."),
                Answer(259, 65, false, "Alignment and shaping."),
                Answer(260, 65, false, "Bending and heating."),

                Answer(261, 66, false, "3.5 and 4.5 lbs."),
                Answer(262, 66, false, "2.5 and 3.5 lbs."),
                Answer(263, 66, false, "1.5 and 2.5 lbs."),
                Answer(264, 66, true, "0.5 and 1.5 lbs."),

                Answer(265, 67, false, "We need a proper cleaver."),
                Answer(266, 67, true, "We need to clean the splicing tool frequently."),
                Answer(267, 67, false, "We have to use index matching gel."),
                Answer(268, 67, false, "We need equipment to get accurate alignment."),

                Answer(269, 68, true, "Too much light will escape."),
                Answer(270, 68, false, "Fibers will not be aligned properly."),
                Answer(271, 68, false, "Fibers will not be melted together."),
                Answer(272, 68, false, "Too less light will escape."),

                Answer(273, 69, false, "High current and low time."),
                Answer(274, 69, false, "High time and low current."),
                Answer(275, 69, true, "Fusion time and fusion current."),
                Answer(276, 69, false, "Fusion parameters and fiber type."),

                Answer(277, 70, true, "OTDR."),
                Answer(278, 70, false, "TIR."),
                Answer(279, 70, false, "SMA."),
                Answer(280, 70, false, "LED."),

                Answer(281, 71, false, "Cable TV."),
                Answer(282, 71, false, "LAN."),
                Answer(283, 71, false, "Long-distance internet backbones."),
                Answer(284, 71, true, "All the above."),

                Answer(285, 72, false, "OTDR."),
                Answer(286, 72, true, "BERT."),
                Answer(287, 72, false, "TIR."),
                Answer(288, 72, false, "ST."),

                Answer(289, 73, true, "Short pulse of light."),
                Answer(290, 73, false, "Long pulse of light."),
                Answer(291, 73, false, "Square pulse of light."),
                Answer(292, 73, false, "Triangle pulse of light."),

                Answer(293, 74, false, "Low power reflection."),
                Answer(294, 74, false, "Normal power reflection."),
                Answer(295, 74, true, "High power reflection."),
                Answer(296, 74, false, "No reflection at all."),

                Answer(297, 75, false, "A few impulses are sent to the line repeatedly."),
                Answer(298, 75, false, "Hundreds of impulses are sent to the line repeatedly."),
                Answer(299, 75, true, "Thousands of impulses are sent to the line repeatedly."),
                Answer(300, 75, false, "Millions of impulses are sent to the line repeatedly."),

                Answer(301, 76, false, "Addition."),
                Answer(302, 76, false, "Subtraction."),
                Answer(303, 76, false, "Division."),
                Answer(304, 76, true, "Average.")


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