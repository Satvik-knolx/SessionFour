package com.knoldus

object Driver extends App {
  // Create a new instance of the CalculatorScala class and perform arithmetic operations
  private val calculator = new CalculatorScala()
  println(calculator.add(2, 3)) // Prints the result of adding 2 and 3
  println(calculator.subtract(5, 2)) // Prints the result of subtracting 2 from 5
  println(calculator.multiply(3, 4)) // Prints the result of multiplying 3 and 4
  println(calculator.divide(6, 2)) // Prints the result of dividing 6 by 2
  println(calculator.divide(3, 0)) // Prints an error message as division by 0 is not possible

  // Create a new instance of the StorageScala class and perform storage operations
  private val storage = new StorageScala
  storage.addElement(1) // Add the element 1 to the storage
  storage.addElement(2) // Add the element 2 to the storage
  storage.addElement(3) // Add the element 3 to the storage
  println(storage.checkIfContains(2)) // Checks if the storage contains the element 2 and prints the result
  storage.removeElement(2) // Remove the element 2 from the storage
  println(storage.checkIfContains(2)) // Checks if the storage contains the element 2 and prints the result
  storage.removeAll() // Removes all elements from the storage
}
