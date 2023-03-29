
package com.knoldus

import scala.util.Try

object DayThree extends App {
  private val numOne: Option[Int] = Some(3)
  private val numTwo: Option[Int] = Some(5)
  private val numThree: Option[Int] = Some(2)


  private def addition: Option[Int] = {

    val sum = numOne.flatMap { valueOne =>
      numTwo.flatMap { valueTwo =>
        numThree.map { valueThree =>
          valueOne + valueTwo + valueThree
        }
      }
    }
    sum
  }

  println(addition)

  private val numberOne = Try(4)
  private val numberTwo = Try (2)
  private val numberThree = Try(3)
  private val numberFour = Try(1)

  private val result = for  {
    numOne <- numberOne
    numTwo <- numberTwo
    numThree <- numberThree
    numFour <- numberFour
  } yield (numOne + numTwo) - (numThree + numFour)
  println(result)
}