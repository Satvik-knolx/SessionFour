package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class CapitalizeTest extends AnyFunSuite {
  test("Capitalize should capitalize 'a' in a list of strings") {
    val capitalized = new Capitalize()
    val listToCapitalize = List("My", "name", "is", "Michael", "Scott")
    val expected = List("My", "nAme", "is", "MichAel", "Scott")
    assert(capitalized.capitalize(listToCapitalize) == expected)
  }

  test("Capitalize should return an empty list when given an empty list") {
    val capitalized = new Capitalize()
    val inputList = List.empty[String]
    val expected = List.empty[String]
    assert(capitalized.capitalize(inputList) == expected)
  }
}

