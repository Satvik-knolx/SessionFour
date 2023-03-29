package com.knoldus

object SquareRootDriver extends App {
  val inputList: List[Int] = List(4, 9, 16, 25)
  private val squareRoot = new SquareRoot
  println(squareRoot.squareRootOfNumbers(inputList))
}
