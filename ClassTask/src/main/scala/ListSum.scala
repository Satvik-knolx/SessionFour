package com.knoldus

import scala.annotation.tailrec

class ListSum {
  def sumOfList(listInput: List[Int]): Int = {
    if (listInput.isEmpty) {
      return 0
    } else {
      @tailrec
      def sum(listInput: List[Int], sumOfElement: Int): Int = {
        listInput match {
          case element :: tail => sum(tail, sumOfElement + element)
          case Nil => sumOfElement
        }
      }
      sum(listInput, 0)
    }
  }
}
