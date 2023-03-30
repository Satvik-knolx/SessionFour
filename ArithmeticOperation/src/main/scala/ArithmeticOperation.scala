package com.knoldus

import scala.util.{Failure, Success, Try}

// This class provides methods for performing arithmetic operations on a list of numbers.
class ArithmeticOperation {

  // This method performs arithmetic operation on the provided list of optional values.
  // It takes a list of optional values and a string indicating the operation to be performed.
  // The type parameter T must be a subtype of Numeric.
  // The method returns a Try object, which can contain either a success value or a failure value.
  def arithmeticOperationOnList[T: Numeric](optionList: List[Option[T]], operation: String): Try[T] = {

    // Flatten the list to remove the optional values
    val result = for {element <- optionList.flatten} yield element

    // Perform the arithmetic operation based on the provided string
    operation match { // If the operation is Addition, add all the values in the list
      case "Addition" => if (result.isEmpty) Failure(new Exception("Empty list")) // Return a failure if the list is empty
      else Success(result.reduce(Numeric[T].plus)) // Return the sum of the values

      // If the operation is Subtraction, subtract all the values in the list
      case "Subtraction" => if (result.isEmpty) Failure(new Exception("Empty list")) // Return a failure if the list is empty
      else Success(result.reduce(Numeric[T].minus)) // Return the difference of the values

      // If the operation is Multiplication, multiply all the values in the list
      case "Multiplication" => if (result.isEmpty) Failure(new Exception("Empty list")) // Return a failure if the list is empty
      else Success(result.reduce(Numeric[T].times)) // Return the product of the values

      // If the operation is not one of the above, return a failure
      case _ => Failure(new Exception("Invalid operation"))
    }
  }
}
