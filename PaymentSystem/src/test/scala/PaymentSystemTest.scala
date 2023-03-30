
package com.knoldus

import PaymentSystem.{PaymentManager, PaymentMethod}

import org.scalatest.funsuite.AnyFunSuite

class PaymentSystemTest extends AnyFunSuite {
  val creditCard: PaymentSystem.CreditCard = PaymentSystem.CreditCard("John", "1234 5678 8765 4321", "123", "12/24")
  val paypal: PaymentSystem.PayPal = PaymentSystem.PayPal("John", "abc@mail.com", "password")
  val bankTransfer: PaymentSystem.BankTransfer = PaymentSystem.BankTransfer("John", "9876543210", "ICICI")

  test("test for adding different payment methods") {
    assert(PaymentSystem.PaymentManager.addPaymentMethod(creditCard))
    assert(PaymentSystem.PaymentManager.addPaymentMethod(paypal))
    assert(PaymentSystem.PaymentManager.addPaymentMethod(bankTransfer))
  }

  test("test for processing of payments") {
    val amount = 100.0

    val paymentByCredit = PaymentSystem.PaymentManager.processPayment(amount, creditCard)
    assert(paymentByCredit)

    val paymentByPaypal = PaymentSystem.PaymentManager.processPayment(amount, paypal)
    assert(paymentByPaypal)

    val paymentByBank = PaymentSystem.PaymentManager.processPayment(amount, bankTransfer)
    assert(paymentByBank)
  }

  test("test for listing all the payment methods added") {
    val paymentMethods: List[PaymentSystem.PaymentMethod] = PaymentSystem.PaymentManager.listPaymentMethods()
    assert(paymentMethods.length == 3)
    assert(paymentMethods.contains(creditCard))
    assert(paymentMethods.contains(paypal))
    assert(paymentMethods.contains(bankTransfer))
  }

  // Test unsuccessful payment processing due to invalid payment method
  test("processPayment should return false for an invalid payment method") {
    val invalidPaymentMethod = new PaymentMethod("Invalid Payment Method", "0000000000") {}
    val result = PaymentManager.processPayment(100.0, invalidPaymentMethod)
    assert(result === false)
  }

}
