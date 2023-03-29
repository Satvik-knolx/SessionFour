package com.knoldus

class Capitalize {
  def capitalize(listToCapitalize: List[String]): List[String] = {
    val toCapitalize = 'a'
    listToCapitalize.map(string => {
      val index = string.indexOf(toCapitalize)
      if (index >= 0) {
        string.replaceFirst(s"$toCapitalize", s"${toCapitalize.toUpper}")
      } else {
        string
      }
    })
  }
}
