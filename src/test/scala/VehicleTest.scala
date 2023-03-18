package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
class VehicleTest extends AnyFlatSpec with Matchers{
  "Car" should "be driven" in {
    val carObject = new Car()
    assert(carObject.move == "A car can be driven.")
  }
  "Boat" should "be sailed" in {
    val boatObject = new Boat()
    assert(boatObject.move == "A boat can be sailed.")
  }
  "Aeroplane" should "be flown" in {
    val aeroplaneObject = new Aeroplane()
    assert(aeroplaneObject.move == "An aeroplane can be flown.")
  }
  "Flying Cars" should "be driven and flown" in {
    val flyingCarsObject = new FlyingCars()
    assert(flyingCarsObject.move == "A flying car can be driven and can be flown.")
  }
  "Hovercraft" should "be sailed and driven" in {
    val hovercraftObject = new Hovercraft()
    assert(hovercraftObject.move == "An hovercraft can be sailed and can be driven.")
  }
}
