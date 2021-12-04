package com.knoldus.Question1

import org.scalatest.flatspec.AnyFlatSpec

class PassValidatorTest extends AnyFlatSpec {
  val password = new PassValidator("")

  "A Password " should "have all necessary features" in{
    val result =password.isValidPassword("Knoldus@123")
    assert(result)
  }
   "A Password" should " not contain any space" in{
    val result= password.isValidPassword("Knoldus @123")
     assert(!result)
  }
  "A Password" should "be invalid if character are less then 8 " in{
    val result = password.isValidPassword("Knol@")
    assert(!result)
  }
  "A Password" should "be invalid if the character are more than 15" in{
    val result = password.isValidPassword("Iamknolder@123445xyz")
    assert(!result)
  }
  "A Password" should "be invalid if it does not contain a Special Character" in{
    val result = password.isValidPassword("Knoldus123")
    assert(!result)
  }
  "A Password" should "be invalid if it does not contain any number" in{
    val result = password.isValidPassword("Knoldus@")
    assert(!result)
  }
  "A Password" should "contain at least one lowercase" in{
    val result = password.isValidPassword("KNOLDUS@!@#")
    assert(!result)
  }
  "A Password" should "contain at least one Uppercase" in{
    val result =password.isValidPassword("knoldus@123")
    assert(!result)
  }


}
