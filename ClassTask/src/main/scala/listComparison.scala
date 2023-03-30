package com.knoldus

object listComparison extends App {
  private val listOne = List(1, 2, 3)
  private val listTwo = List(1, 2, 3)
  private val listThree = List(4, 5, 6)
  private val listFour = listOne

  println(listOne.equals(listTwo))
  println(listOne.equals(listThree))
  println(listOne.equals(listFour))

  println(listOne.eq(listTwo))
  println(listOne.eq(listThree))
  println(listOne.eq(listFour))

  println(listOne == listTwo)
  println(listOne == listThree)
  println(listOne == listFour)
}
