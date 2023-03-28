import org.scalatest.funsuite.AnyFunSuite

class FibonacciTest extends AnyFunSuite {

  test("Fibonacci of 0 should return None") {
    assert(Fibonacci.fibonacci(0) === Some(0))
  }

  test("Fibonacci of negative number should return None") {
    assert(Fibonacci.fibonacci(-1) === None)
  }

  test("Fibonacci of 1 should return Some(1)") {
    assert(Fibonacci.fibonacci(1) === Some(1))
  }

  test("Fibonacci of 2 should return Some(1)") {
    assert(Fibonacci.fibonacci(2) === Some(1))
  }

  test("Fibonacci of 10 should return Some(55)") {
    assert(Fibonacci.fibonacci(10) === Some(55))
  }

}
