package org.knoldus.practice

import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Increment extends App {
//  private val numberToBeIncremented = readInt()
//
//  private def numberIncrementByOne() = {
//
//    val incrementByOne = numberToBeIncremented + 1
//    incrementByOne
//  }
//
//  private def numberIncrementByTwo(): Int = {
//    val incrementByTwo: Int = numberIncrementByOne() + 1
//    incrementByTwo
//  }
//
//  println(numberIncrementByOne())
//  println(numberIncrementByTwo())
  private val numberIncrementBy = readInt()

  @tailrec
  private def incrementRecursively(numberIncrementBy: Int, numberToIncrement: Int = readInt()): Int = {
    if (numberIncrementBy == 0)
      numberToIncrement
    else
      incrementRecursively(numberIncrementBy - 1, numberToIncrement + 1)
  }

  println(incrementRecursively(numberIncrementBy))

}


