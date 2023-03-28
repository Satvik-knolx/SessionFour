package com.knoldus

import scala.io.StdIn.readLine

object ExtractorClass extends App {
  // Read a URL string from the user using the readLine function
  private val url: String = readLine("Enter a URL: ")

  // Use pattern matching to extract protocol, domain and path from the URL string
  url match {
    case URLParser(protocol, domain, path) =>
      println(s"Protocol: $protocol\n" + s"Domain: $domain\n" + s"Path: $path")
    case _ =>
      println("Invalid URL")
  }
}

