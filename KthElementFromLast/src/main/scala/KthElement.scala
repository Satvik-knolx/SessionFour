package com.knoldus

class KthElement {
  def kthElementFromEnd[T](inputList: List[T], elementKFromEnd: Int): Option[T] = {
    if (elementKFromEnd < 0 || elementKFromEnd >= inputList.length) {
      // Invalid value of elementKFromEnd
      None
    } else {
      // Valid value of elementKFromEnd
      Some(inputList.reverse(elementKFromEnd - 1))
    }
  }
}
