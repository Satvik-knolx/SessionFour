package com.knoldus

// import required packages

import org.scalatest.funsuite.AnyFunSuite

class URLParserTest extends AnyFunSuite {

  // Defined a test for a valid URL
  test("valid URL") {
    val url = "https://www.mywebsite.com/home"
    val expected = Some("https", "www.mywebsite.com", "home")
    val actual = URLParser.unapply(url)
    assert(actual == expected)
  }

  // Defined a test for incomplete URL
  test("incomplete url") {
    val url = "https://www.mywebsite.com"
    val expected = None
    val actual = URLParser.unapply(url)
    assert(actual == expected)
  }

  // Defined a test for an invalid URL
  test("invalid URL") {
    val url = "www.mywebsite.com/home"
    val expected = None
    val actual = URLParser.unapply(url)
    assert(actual == expected)
  }
}

