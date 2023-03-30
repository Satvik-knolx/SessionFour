
package com.knoldus
object PaymentSystemDriver {
  def main(args: Array[String]): Unit = {
    // Add a credit card payment method
    val creditCard = PaymentSystem.CreditCard("Satvik", "1234 5678 8765 4321", "123", "12/24")
    PaymentSystem.PaymentManager.addPaymentMethod(creditCard)
    println("Added payment method for Credit Card")

    // Add a PayPal payment method
    val paypal = PaymentSystem.PayPal("Satvik", "abc@mail.com", "password")
    PaymentSystem.PaymentManager.addPaymentMethod(paypal)
    println("Added payment method for Paypal")

    // Add a BankTransfer payment method
    val bankTransfer = PaymentSystem.BankTransfer("Satvik", "9876543210", "ICICI")
    PaymentSystem.PaymentManager.addPaymentMethod(bankTransfer)
    println("Added payment method for BankTransfer")


    // Process a payment with a credit card
    val amount = 100.0
    val paymentByCredit = PaymentSystem.PaymentManager.processPayment(amount, creditCard)
    if (paymentByCredit) {
      println("Payment successful")
    } else {
      println("Payment failed")
    }

    val paymentByBank = PaymentSystem.PaymentManager.processPayment(amount, bankTransfer)
    if (paymentByBank) {
      println("Payment successful")
    } else {
      println("Payment failed")
    }

    val paymentByPaypal = PaymentSystem.PaymentManager.processPayment(amount, paypal)
    if (paymentByPaypal) {
      println("Payment successful")
    } else {
      println("Payment failed")
    }
    // List all payment methods
    val paymentMethods = PaymentSystem.PaymentManager.listPaymentMethods()
    for (method <- paymentMethods) {
      println(s"Payment of $amount by ${method.name} via $method was done successfully.")
    }
  }
}
