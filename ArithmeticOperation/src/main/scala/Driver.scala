package com.knoldus

import scala.util.{Failure, Success}

object Driver extends App {
  private val operation = new ArithmeticOperation
  private val emptyList = List.empty
  private val listInt = List(Some(1), Some(2), Some(3), Some(4))
  private val listLong = List(Some(1L), Some(2L), Some(3L), Some(4L))
  private val listDouble = List(Some(1.01), Some(2.02), Some(3.02), Some(4.02))

  // Perform the arithmetic operations on the result for Int, Long and Double values
  operation.arithmeticOperationOnList(listInt, "Addition") match {
    case Success(result) => println(result)
    case Failure(exception) => println(s"Addition operation failed with exception: ${exception.getMessage}")
  }

  operation.arithmeticOperationOnList(listInt, "Subtraction") match {
    case Success(result) => println(result)
    case Failure(exception) => println(s"Subtraction operation failed with exception: ${exception.getMessage}")
  }

  operation.arithmeticOperationOnList(listInt, "Multiplication") match {
    case Success(result) => println(result)
    case Failure(exception) => println(s"Multiplication operation failed with exception: ${exception.getMessage}")
  }

  operation.arithmeticOperationOnList(listLong, "Addition") match {
    case Success(result) => println(result)
    case Failure(exception) => println(s"Addition operation failed with exception: ${exception.getMessage}")
  }

  operation.arithmeticOperationOnList(listLong, "Subtraction") match {
    case Success(result) => println(result)
    case Failure(exception) => println(s"Subtraction operation failed with exception: ${exception.getMessage}")
  }

  operation.arithmeticOperationOnList(listLong, "Multiplication") match {
    case Success(result) => println(result)
    case Failure(exception) => println(s"Multiplication operation failed with exception: ${exception.getMessage}")
  }

  operation.arithmeticOperationOnList(listDouble, "Addition") match {
    case Success(result) => println(result)
    case Failure(exception) => println(s"Addition operation failed with exception: ${exception.getMessage}")
  }

  operation.arithmeticOperationOnList(listDouble, "Subtraction") match {
    case Success(result) => println(result)
    case Failure(exception) => println(s"Subtraction operation failed with exception: ${exception.getMessage}")
  }

  operation.arithmeticOperationOnList(listDouble, "Multiplication") match {
    case Success(result) => println(result)
    case Failure(exception) => println(s"Multiplication operation failed with exception: ${exception.getMessage}")
  }

  operation.arithmeticOperationOnList(emptyList, "Addition")(Numeric.IntIsIntegral) match {
    case Success(result) => println(result)
    case Failure(exception) => println(s"Addition operation failed: ${exception.getMessage}")
  }

  operation.arithmeticOperationOnList(emptyList, "Division")(Numeric.IntIsIntegral) match {
    case Success(result) => println(result)
    case Failure(exception) => println(s"Cannot perform calculation: ${exception.getMessage}")
  }
}
