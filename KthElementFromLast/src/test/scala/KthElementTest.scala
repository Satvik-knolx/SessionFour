import com.knoldus.KthElement
import org.scalatest.funsuite.AnyFunSuite

class KthElementTest extends AnyFunSuite {
  val kthElementObject = new KthElement

  test("kthElementFromEnd should return None for empty list") {
    assert(kthElementObject.kthElementFromEnd(List(), 2) == None)
  }

  test("kthElementFromEnd should return None for invalid value of k") {
    assert(kthElementObject.kthElementFromEnd(List(1, 2, 3), -1) == None)
    assert(kthElementObject.kthElementFromEnd(List(1, 2, 3), 3) == None)
  }

}
