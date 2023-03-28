package com.knoldus

// import required packages

import scala.util.Try

class URLParser(protocol: String, domain: String, path: String)

object URLParser {

  // Define an unapply method to extract protocol, domain and path from the URL string
  def unapply(url: String): Option[(String, String, String)] = {
  
    // Used Try to handle errors that might occur while parsing the URL
    Try {
      if (url.startsWith("http")) {
        val protocolEnd = url.indexOf(":")
        val protocol = url.substring(0, protocolEnd)
        val domainStart = protocolEnd + 3
        val domainEnd = url.indexOf("/", domainStart)
        val domain = url.substring(domainStart, domainEnd)
        val path = url.substring(domainEnd + 1)
        Some(protocol, domain, path)
      } else {
        None // if the URL doesn't start with "http", return None
      }
    }.getOrElse(None) // handle any errors that occurred while parsing the URL and return None
  }
}
