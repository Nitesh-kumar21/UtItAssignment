package com.knoldus.Question2

trait FactPal{
  def isPalindromeNumber(number: Int): Boolean
  def getFactorial(digit: Int): Int


}
class FactorialPalindrome extends FactPal {

  def isPalindromeNumber(number: Int): Boolean = {


    var copy_number: Int = number
    var remainder = 0
    var reverse = 0

    while (copy_number > 0) {
      remainder = copy_number % 10
      reverse = reverse * 10 + remainder
      copy_number = copy_number / 10
    }

    if (reverse == number)
      true
    else
      false

  }
   def getFactorial(number: Int): Int={



    var result: Int = 1
    for (increment <- 2 to number) {
      result *= increment
    }
    result
  }


}
