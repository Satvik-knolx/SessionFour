
package com.knoldus

object DriverCode extends App {
  private val equalityOperator = new EqualityOperator()

  private val equalsCheckResult = equalityOperator.equalsCheckOnVariableWithDifferentValues()
  println(s"Equals Check on variable with different values: $equalsCheckResult")

  private val equalsCheckOneResult = equalityOperator.equalsCheckOnVariableWithSameValues()
  println(s"Equals Check on variable with same values: $equalsCheckOneResult")

  private val doubleEqualsCheckResult = equalityOperator.doubleEqualsCheckOnVariableWithDifferentValues()
  println(s"Double Equals Check on variable with different values: $doubleEqualsCheckResult")

  private val doubleEqualsCheckOneResult = equalityOperator.doubleEqualsCheckOnVariableWithSameValues()
  println(s"Double Equals Check on variable with same values: $doubleEqualsCheckOneResult")

  private val notEqualsCheckResult = equalityOperator.notEqualsCheckOnVariableWithDifferentValues()
  println(s"Not Equals Check on variable with different values : $notEqualsCheckResult")

  private val notEqualsCheckOneResult = equalityOperator.notEqualsCheckOnVariableWithSameValues()
  println(s"Not Equals Check on variable with same values: $notEqualsCheckOneResult")

  private val neCheckResult = equalityOperator.neCheckOnVariableWithDifferentValues()
  println(s"ne Check on variable with different values: $neCheckResult")

  private val neCheckOneResult = equalityOperator.neCheckOnVariableWithSameValues()
  println(s"ne Check on variable with same values: $neCheckOneResult")

  private val eqCheckResult = equalityOperator.eqCheckOnVariableWithDifferentValues()
  println(s"eq Check on variable with different values: $eqCheckResult")

  private val eqCheckOneResult = equalityOperator.eqCheckOnVariableWithSameValues()
  println(s"eq Check on variable with same values: $eqCheckOneResult")
}


