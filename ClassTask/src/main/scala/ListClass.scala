package com.knoldus

object ListClass extends App {
  private val list = List(1, 2, 3, 4, 5)
  println(list.length)
  println(list.size)
  private val list2 = list.drop(2)
  println(list2.dropRight(2).mkString)

}

case class SomeClass(number: String, isEven: Boolean)

object SomeClass extends App {
  private val listOfSomeClass: List[SomeClass] = List(SomeClass("1", isEven = false), SomeClass("2", isEven = true), SomeClass("3", isEven = false), SomeClass("4", isEven = true), SomeClass("5", isEven = false))
  println(listOfSomeClass)
}

case class FilterNumbers(number: String, isEven: Boolean)

object FilterNumbers extends App {
  private val listOfIntegers: List[FilterNumbers] = List(FilterNumbers("1", isEven = false), FilterNumbers("2", isEven = true), FilterNumbers("3", isEven = false), FilterNumbers("4", isEven = true), FilterNumbers("5", isEven = false))
  private val listOfEven = listOfIntegers.filter(value => value.isEven)
  private val listOfOdd = listOfIntegers.filterNot(value => value.isEven)

  private val (even, odd) = listOfIntegers.partition(value => value.isEven)
  private val listFirstElements =listOfIntegers.map(element => element.number)
  println("Odd Numbers: " + listOfOdd)
  println("Even Numbers: " + listOfEven)
  println(even)
  println(odd)
  println(listFirstElements)

}