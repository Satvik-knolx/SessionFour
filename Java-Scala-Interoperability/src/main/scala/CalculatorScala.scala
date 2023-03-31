package com.knoldus

class CalculatorScala {
  private val scalaCalculator = new Calculator

  // Implements the add method of the Calculator class
  def add(valueOne: Int, valueTwo: Int): Int = scalaCalculator.add(valueOne, valueTwo)

  // Implements the subtract method of the Calculator class
  def subtract(valueOne: Int, valueTwo: Int): Int = scalaCalculator.subtract(valueOne, valueTwo)

  // Implements the multiply method of the Calculator class
  def multiply(valueOne: Int, valueTwo: Int): Int = scalaCalculator.multiply(valueOne, valueTwo)

  // Implements the divide method of the Calculator class
  def divide(valueOne: Int, valueTwo: Int): Int = scalaCalculator.divide(valueOne, valueTwo)
}
