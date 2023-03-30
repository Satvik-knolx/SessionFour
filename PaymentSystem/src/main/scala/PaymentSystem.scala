
package com.knoldus

import scala.collection.mutable.ListBuffer

object PaymentSystem {
  abstract class PaymentMethod(val name: String, val accountNumber: String)

  case class CreditCard(
                         override val name: String,
                         override val accountNumber: String,
                         cvv: String,
                         expiryDate: String
                       ) extends PaymentMethod(name, accountNumber) {
    override def toString: String = s"Card transfer from $accountNumber account"
  }

  case class PayPal(override val name: String, override val accountNumber: String, password: String) extends PaymentMethod(name, accountNumber) {
    override def toString: String = s"Paypal from account id $accountNumber"
  }

  case class BankTransfer(override val name: String, override val accountNumber: String, bankName: String) extends PaymentMethod(name, accountNumber) {
    override def toString: String = s"Bank transfer from $bankName account"
  }

  private class PaymentProcessor(paymentMethod: PaymentMethod) {
    def processPayment(amount: Double): Boolean = {
      // Match on the type of `paymentMethod` to process the payment based on the payment method used
      paymentMethod match {
        case CreditCard(name, accountNumber, cvv, expiryDate) =>
          println(s"Processing credit card payment of $amount for $name with account number $accountNumber, CVV number $cvv and expiry date $expiryDate")
          //  validation for credit card payments
          true
        case PayPal(name, accountNumber, password) =>
          println(s"Processing PayPal payment of $amount for $name with account number $accountNumber")
          //  validation for PayPal payments
          true
        case BankTransfer(name, accountNumber, bankName) =>
          println(s"Processing bank transfer payment of $amount for $name with account number $accountNumber at $bankName")
          //  processing for bank transfer payments
          true
        case _ =>
          println("Invalid payment method")
          false
      }
    }
  }

  // Define an object `PaymentManager` with methods to manage payment methods and process payments
  object PaymentManager {
    // Define a ListBuffer `paymentMethods` to store payment methods
    private val paymentMethods = ListBuffer[PaymentMethod]()

    // Define a method to add a payment method to the `paymentMethods` list and return a Boolean indicating success
    def addPaymentMethod(paymentMethod: PaymentMethod): Boolean = {
      if (paymentMethods.contains(paymentMethod)) {
        false
      } else {
        paymentMethods += paymentMethod
        true
      }
    }

    // Define a method to return a list of all payment methods stored in paymentMethods
    def listPaymentMethods(): List[PaymentMethod] = {
      paymentMethods.toList
    }

    // Define a method to process a payment with a given amount and payment method, using the PaymentProcessor class
    // This method returns a Boolean indicating success or failure of payment processing
    def processPayment(amount: Double, paymentMethod: PaymentMethod): Boolean = {
      val processor = new PaymentProcessor(paymentMethod)
      processor.processPayment(amount)
    }


  }

}
