##Objective of this project is to carry out below tasks

#Create a class with an annotated method fibonacci that takes an integer n as a parameter and returns the nth Fibonacci number.

Annotate the fibonacci method with the @tailrec annotation to indicate that the method uses tail recursion.

Call the fibonacci method inside the Main Object, passing in a positive integer n.

Print the result returned by the fibonacci method.

Input: 10
Output: 55

#annotations

Scala Annotations let us associate meta-information with definitions.Applies to the first definition or declaration following it. Multiple annotations can be used before a definition or declaration Order of annotations doesn’t matter

Scala annotation is of the form @c or @c(a1,…,an), where c is a constructor for class C, which conforms to the scala.Annotation class.

#@tailrec:

This annotation ensures that a method is tail-recursive. Tail-recursion can keep memory requirements constant.
