# Objective of this project is to carry out below tasks

## Write a function that takes a list of Option of numbers and performs some arithmetic operation ("Addition", "Subtraction", "Multiplication") passed to the function by the user.
Hint: First convert List[Option[T]] to List[T] (use for expressions for this) and then perform the arithmetic function over it (make use of Pattern Matching for this). 

Sample Input: methodName((List(Some(1), Some(2), Some(3), Some(4)), "Addition")
Sample Output: 10

# Arithmetic Operations on Lists
This project provides a simple implementation of arithmetic operations on lists of Integers, Longs, and Doubles. The arithmetic operations include addition, subtraction, and multiplication.

The implementation uses Scala's Numeric type class, which allows us to perform arithmetic operations on generic types without needing to know the specific type of the values in the list. The implementation also handles edge cases such as empty lists and invalid operations.
