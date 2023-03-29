package com.knoldus

object CapitalizeDriver {
  def main(args: Array[String]): Unit = {
    val listToCapitalize: List[String] = List("My", "name", "is", "Michael", "Scott")
    val capitalizeObject = new Capitalize
    val capitalizedList = capitalizeObject.capitalize(listToCapitalize)
    println(capitalizedList)
  }
}
