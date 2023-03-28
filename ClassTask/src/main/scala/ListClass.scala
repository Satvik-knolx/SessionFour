package com.knoldus

import com.knoldus.FilterNumbers.executionStart.%

import scala.io.StdIn.{readInt, readLine}

object ListClass extends App {
  val list = List(1, 2, 3, 4, 5)
  println(list.length)
  println(list.size)
  val list2 = list.drop(2)
  println(list2.dropRight(2).mkString)

}

case class SomeClass(number: String, isEven: Boolean)

object SomeClass extends App {
  private val listOfSomeClass: List[SomeClass] = List(SomeClass("1", false), SomeClass("2", true), SomeClass("3", false), SomeClass("4", true), SomeClass("5", false))
  println(listOfSomeClass)
}

case class FilterNumbers(number: String, isEven: Boolean)
object FilterNumbers extends App {
  private val listOfIntegers: List[FilterNumbers] = List(FilterNumbers("1", false), FilterNumbers("2", true), FilterNumbers("3", false), FilterNumbers("4", true), FilterNumbers("5", false))
  private val listOfEven = listOfIntegers.filter(value => value.isEven)
  private val listOfOdd = listOfIntegers.filterNot(value => value.isEven)

  private val (even,odd) = listOfIntegers.partition(value => value.isEven)

  println("Odd Numbers: " + listOfOdd)
  println("Even Numbers: " + listOfEven)
  println(even)
  println(odd)

}