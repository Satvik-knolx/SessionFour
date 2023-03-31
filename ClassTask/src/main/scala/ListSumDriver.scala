package com.knoldus

object ListSumDriver {
  def main(args: Array[String]): Unit = {
    val sumOfList = new ListSum
    val result = sumOfList.sumOfList(List(1,2,3,4,5,6))
    println(result)
  }
}
