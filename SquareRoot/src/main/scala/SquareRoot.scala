package com.knoldus

class SquareRoot {
  def squareRootOfNumbers(inputList: List[Int]): List[Double] = {
    // Map each element in the input list to its square root
    val newList = for {
      element <- inputList
      squareRoot <- math.sqrt(element).isNaN match {
        case true => None
        case false => Some(math.sqrt(element))
      }
    } yield squareRoot

    newList
  }

}