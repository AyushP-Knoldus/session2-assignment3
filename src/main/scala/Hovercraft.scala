package com.knoldus
class Hovercraft extends Vehicle with Sailable with Driveable {
  override def move : String =s"An hovercraft $sail and $drive."

}
