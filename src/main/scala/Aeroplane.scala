package com.knoldus
class Aeroplane extends Vehicle with Flyable{
  override def move: String =s"An aeroplane $fly."
}
