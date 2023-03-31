package com.knoldus

/**
 * This class provides methods to check the equality of variables using different operators.
 */
class EqualityOperator {
  private val stringOne = "StringOne"
  private val stringTwo = "StringTwo"
  private val stringThree = "StringOne"

  def equalsCheckOnVariableWithDifferentValues(): Boolean = {
    stringOne.equals(stringTwo)
  }

  def equalsCheckOnVariableWithSameValues(): Boolean = {
    stringOne.equals(stringThree)
  }

  def doubleEqualsCheckOnVariableWithDifferentValues(): Boolean = {
    stringOne == stringTwo
  }

  def doubleEqualsCheckOnVariableWithSameValues(): Boolean = {
    stringOne == stringThree
  }

  def notEqualsCheckOnVariableWithDifferentValues(): Boolean = {
    stringOne != stringTwo
  }

  def notEqualsCheckOnVariableWithSameValues(): Boolean = {
    stringOne != stringThree
  }

  /**
   * Checks if two string variables are not equal using the 'ne' operator.
   * Returns true if the strings are different, false otherwise.
   */
  def neCheckOnVariableWithDifferentValues(): Boolean = {
    stringOne.ne(stringTwo)
  }

  def neCheckOnVariableWithSameValues(): Boolean = {
    stringOne.ne(stringThree)
  }

  /**
   * Checks if two string variables are equal using the 'eq' operator.
   * Returns true if the strings are the same, false otherwise.
   */
  def eqCheckOnVariableWithDifferentValues(): Boolean = {
    stringOne.eq(stringTwo)
  }

  def eqCheckOnVariableWithSameValues(): Boolean = {
    stringOne.eq(stringThree)
  }
}
