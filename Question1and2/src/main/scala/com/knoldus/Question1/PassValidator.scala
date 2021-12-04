package com.knoldus.Question1

class PassValidator (Pass:String){
  def isValidPassword(password: String): Boolean ={
    var regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.\\S)(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,15}$"
    return password.matches(regex)
  }
}
