package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class SquareRootTest extends AnyFunSuite {
  val squareRootObject = new SquareRoot

  test("squareRootOfNumbers should return empty list for empty input list") {
    assert(squareRootObject.squareRootOfNumbers(List()) == List())
  }

  test("squareRootOfNumbers should return correct list for valid input list") {
    assert(squareRootObject.squareRootOfNumbers(List(4, 9, 16, 25)) == List(2.0, 3.0, 4.0, 5.0))
  }

  test("squareRootOfNumbers should handle NaN values correctly") {
    assert(squareRootObject.squareRootOfNumbers(List(-1, 0, 1)) == List(Double.NaN, 0.0, 1.0))
  }
}
