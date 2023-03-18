package com.knoldus
class FlyingCars extends Vehicle with Driveable with Flyable {
  override def move: String =s"A flying car $drive and $fly."
}
