
# 1. Create a URL parser using the concept of Extractors (unapply method) with pattern matching that takes the input (URL) as string and displays the protocol, domain name, and path from the given URL.

# 2. Write the unit tests for above mentioned URL parser

Input
“https://www.mywebsite.com/home”

Output
Protocol: https
Domain: www.mywebsite.com
Path: home

This is done using unapply method using extractors

# extractor and unapply

An extractor in Scala is an object which has an unapply method as one of its members. Often, the extractor object also defines a method apply for building values, but this is not required. An apply method is like a constructor which takes arguments and creates an object, the unapply method takes an object and tries to give back the arguments. The unapply method reverses the construction procedure of the apply method. the unapply method always returns an Option type, it returns either Some[T] (if it could successfully extract the parameter from the given object) or None, which means that the parameters could not be extracted.

Let’s understand this with the help of an example. We have an object which has both apply and unapply method.

object FullName {

  def apply(firstname: String, lastname: String) = {

    firstname + " " + lastname

  } 

  def unapply(fullName: String): Option[(String, String)] = {

    val splittedName = fullName.split(" ")

    if (splittedName.length == 2)

      Some(splittedName(0), splittedName(1))

    else

      None

  }
  
}

Here, FullName(“Ayush”, “Hooda”) 

i.e., FullName.apply(“Ayush”, “Hooda”) will produce an output “Ayush Hooda” 

and 

FullName.unapply(“Ayush Hooda”) will produce an output of type Option[(String, String)] 

i.e., Some((Ayush, Hooda)).
