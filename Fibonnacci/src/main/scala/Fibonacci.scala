import scala.annotation.tailrec
import scala.util.{Try, Success, Failure}
import scala.io.StdIn.readLine

/**
 * This object contains a method that calculates the nth Fibonacci number using tail recursion.
 */
object Fibonacci {
  /**
   *
   * Calculates the nth Fibonacci number using tail recursion.
   *
   * @param number The number for which the Fibonacci number is to be calculated.
   * @return The Fibonacci number as an Option, or None if the input is invalid.
   */
  def fibonacci(number: Int): Option[Int] = {
    @tailrec
    def fibonacciTailRecursive(fibonacciSeries: Int, lastFibonacci: Int, currentFibonacci: Int): Option[Int] = {
      if (fibonacciSeries < 0)
        None
      else if (fibonacciSeries == 0) {
        Some(0)
      } else if (fibonacciSeries == 1) {
        Some(lastFibonacci)
      } else if (fibonacciSeries == 2) {
        Some(currentFibonacci)
      } else {
        fibonacciTailRecursive(fibonacciSeries - 1, currentFibonacci, lastFibonacci + currentFibonacci)
      }
    }

    fibonacciTailRecursive(number, 1, 1)
  }

  /**
   * Read input from the user and calculate the Fibonacci number, then print the result.
   */
  private val input = Try(readLine("Enter a number: ").toInt)
  private val result = input match {
    case Success(number) => fibonacci(number) match {
      case Some(value) => value.toString
      case None => "Invalid input"
    }
    case Failure(_) => "Invalid input"
  }
  println(result)
}