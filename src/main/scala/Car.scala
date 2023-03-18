package com.knoldus
//Mixing of traits
//Here class car overrides method move from Vehicle and calls method drive from Driveable
class Car extends Vehicle with Driveable {
 override def move: String = s"A car $drive."
}
