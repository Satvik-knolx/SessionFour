package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

import scala.util.Success

class ArithmeticOperationTest extends AnyFunSuite {
  private val operation = new ArithmeticOperation

  test("Addition of list of Integers") {
    assert(operation.arithmeticOperationOnList(List(Some(1), Some(2), Some(3), Some(4)), "Addition") == Success(10))
  }

  test("Subtraction of list of Integers") {
    assert(operation.arithmeticOperationOnList(List(Some(1), Some(2), Some(3), Some(4)), "Subtraction") == Success(-8))
  }

  test("Multiplication of list of Integers") {
    assert(operation.arithmeticOperationOnList(List(Some(1), Some(2), Some(3), Some(4)), "Multiplication") == Success(24))
  }

  test("Addition of list of Longs") {
    assert(operation.arithmeticOperationOnList(List(Some(1L), Some(2L), Some(3L), Some(4L)), "Addition") == Success(10L))
  }

  test("Subtraction of list of Longs") {
    assert(operation.arithmeticOperationOnList(List(Some(1L), Some(2L), Some(3L), Some(4L)), "Subtraction") == Success(-8L))
  }

  test("Multiplication of list of Longs") {
    assert(operation.arithmeticOperationOnList(List(Some(1L), Some(2L), Some(3L), Some(4L)), "Multiplication") == Success(24L))
  }

  test("Addition of list of Doubles") {
    assert(operation.arithmeticOperationOnList(List(Some(1.01), Some(2.02), Some(3.02), Some(4.02)), "Addition") == Success(10.07))
  }

  test("Subtraction of list of Doubles") {
    assert(operation.arithmeticOperationOnList(List(Some(1.01), Some(2.02), Some(3.02), Some(4.02)), "Subtraction") == Success(-8.05))
  }

  test("Multiplication of list of Doubles") {
    assert(operation.arithmeticOperationOnList(List(Some(1.01), Some(2.02), Some(3.02), Some(4.02)), "Multiplication") == Success(24.768844079999997))
  }

  // Test for empty list, which should result in failure
  test("Exception for empty list") {
    val emptyList = List.empty
    assert(operation.arithmeticOperationOnList(emptyList, "Addition")(Numeric.IntIsIntegral).isFailure)
    assert(operation.arithmeticOperationOnList(emptyList, "Subtraction")(Numeric.IntIsIntegral).isFailure)
    assert(operation.arithmeticOperationOnList(emptyList, "Multiplication")(Numeric.IntIsIntegral).isFailure)
  }

  // Test for invalid operation, which should result in failure
  test("Exception for invalid operation") {
    val listInt = List(Some(1), Some(2), Some(3), Some(4))
    assert(operation.arithmeticOperationOnList(listInt, "Division").isFailure)
  }
}
