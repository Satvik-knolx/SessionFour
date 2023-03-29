package com.knoldus

object KthElementDriver extends App {
  private val findElementObject = new KthElement
  private val list = List(1, 2, 3, 4, 5, 6)
  println(findElementObject.kthElementFromEnd(list, 2).getOrElse("Invalid"))
}
