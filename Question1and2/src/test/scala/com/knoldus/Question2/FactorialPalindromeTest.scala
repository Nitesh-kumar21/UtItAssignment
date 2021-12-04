package com.knoldus.Question2

import org.scalatest.flatspec.AnyFlatSpec

class FactorialPalindromeTest extends AnyFlatSpec {
  val obj= new FactorialPalindrome
  "Factorial " should "be Positive" in{
    val result: Int= obj.getFactorial(4)
    assert(result==24)
  }
  "Factorial" should "return 1 if user input 0" in{
    val result: Int= obj.getFactorial(0)
    assert(result==1)
  }
  "Factorial" should "return 1 if user input is 1" in{
    val result: Int=obj.getFactorial(1)
    assert(result==1)
  }

  "Palindrome " should "return true if the user input is palindrome" in{
    val result= obj.isPalindromeNumber(16461)
    assert(result==true)
  }
  "Palindrome" should "return false if the user input is not a palindrome " in{
    val result= obj.isPalindromeNumber(100)
    assert(result==false)
  }
  "Palindrome" should "return true if the user input 0" in{
    val result = obj.isPalindromeNumber((0))
    assert(result==true)
  }
  "Palindrome" should "return false if the user input is negative" in{
    val result = obj.isPalindromeNumber(-6)
    assert(result==false)
  }



}
