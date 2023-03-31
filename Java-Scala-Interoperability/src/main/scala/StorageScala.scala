package com.knoldus

trait StorageOperations {
  // Adds an element to the storage
  def addElement(element: Int): Unit

  // Removes an element from the storage
  def removeElement(element: Int): Unit

  // Removes all elements from the storage
  def removeAll(): Unit

  // Checks if the storage contains a given element
  def checkIfContains(element: Int): Boolean
}

class StorageScala extends StorageOperations {
  private val scalaStorage = new Storage

  // Implements the addElement method of the StorageOperations trait
  override def addElement(element: Int): Unit = scalaStorage.addElement(element)

  // Implements the removeElement method of the StorageOperations trait
  override def removeElement(element: Int): Unit = scalaStorage.removeElement(element)

  // Implements the removeAll method of the StorageOperations trait
  override def removeAll(): Unit = scalaStorage.removeAll()

  // Implements the checkIfContains method of the StorageOperations trait
  override def checkIfContains(element: Int): Boolean = scalaStorage.checkIfContains(element)
}
