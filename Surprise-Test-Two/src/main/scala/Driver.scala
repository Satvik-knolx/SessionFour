
package com.knoldus

object Driver {
  def main(args: Array[String]): Unit = {
    val sumOfList = new ListSum
    val result = sumOfList.sumOfList(List(1, 2, 3, 4, 5, 6))
    val emptyList = sumOfList.sumOfList(List.empty)
    println(result)
    println(emptyList)
  }
}
