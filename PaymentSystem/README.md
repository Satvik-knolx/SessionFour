# Objective of this project is to carry out below tasks

## Build a payment system for an e-commerce website where users can make payments using different payment methods such as credit cards, PayPal, and bank transfers.
Write a modular program that can perform the following operations:

    Add a new payment method with the details (Pick from credit cards, PayPal, and bank transfers. You can add multiple payment methods)
    Process a payment
    List all the added payment methods

> Take care of the abstraction
> Write unit test cases with 90%+ code coverage

# The objective of the methods in the provided code:

## addPaymentMethod: 

This method adds a new payment method to the paymentMethods list if it doesn't already exist in the list. It returns a Boolean value indicating whether the payment method was added successfully or not.

## listPaymentMethods: 

This method returns a list of all payment methods stored in the paymentMethods list.

## processPayment: 

This method takes in an amount and a payment method, and uses a PaymentProcessor object to process the payment based on the payment method used. It returns a Boolean value indicating whether the payment was processed successfully or not.

## PaymentProcessor: 

This is a private class that takes in a payment method and processes a payment based on the type of payment method used. It contains a processPayment method that performs payment processing based on the payment method used.

# Dependencies
This project requires Scala 2.12.3 or higher. It also requires the scala-test library for running the test cases.

# This project uses abstract classes and case classes

## Case classes:

A case class in Scala is a class that is designed to be used with pattern matching. It is defined using the case class keyword and comes with some additional functionality that a regular class does not have.

Here are some key features of case classes:

They automatically define an apply method, which allows you to create instances of the class without using the new keyword

They automatically define a toString method, which returns a string representation of the instance

They automatically define equals and hashCode methods, which allow instances of the class to be compared by value rather than reference

They can be used in pattern matching, which allows you to easily extract values from instances of the class

Overall, case classes are a useful tool for working with immutable data in Scala.

## Abstract classes:

An abstract class in Scala is a class that cannot be instantiated directly. Instead, it is designed to be subclassed by other classes that provide concrete implementations of any abstract methods or fields defined in the abstract class.

Here are some key features of abstract classes:

They can define abstract methods, which are methods that do not have a body and must be implemented by any subclass

They can define concrete methods, which are methods that have a body and can be used by any subclass without modification

They can define abstract fields, which are fields that do not have a value and must be implemented by any subclass

They can define concrete fields, which are fields that have a value and can be used by any subclass without modification

Overall, abstract classes are a useful tool for creating a common interface for a group of related classes, while still allowing for some variation in implementation details.
