package com.knoldus
class Boat extends Vehicle with Sailable {
  override def move: String = s"A boat $sail."

}
