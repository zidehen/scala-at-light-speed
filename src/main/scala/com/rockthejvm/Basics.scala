package com.rockthejvm

object Basics extends App {
    //defining a value 
  val meaningOfLife: Int = 42 //const int meaningOfLife = 42;
  
  //Int, Boolean, Char, Double, Float, String
  val aBoolean = false // type is optional
  
  // strings and string operations
  val aString = "I love Scala"
  val aComposedString = "I" + " " + "love" + " " + "Scala"
  val aInterpolatedString = s"The meaning of life is $meaningOfLife"

  //expressions = structures that can be reduced to a value
  val anExpression = 2 + 3

  // if-expression
  val ifExpression = if (meaningOfLife > 43) 56 else 999 // in other languages: meaningOfLife > 43 ? 56 : 999
  val chainedIfExpression = 
    if (meaningOfLife > 43) 56
    else if (meaningOfLife < 0) -2
    else if (meaningOfLife > 999) 78
    else 0

  // code blocks
  val aCodeBlock = {
    // definitions
    val aLocalValue = 67
    //value of block is the value of the last expression
    aLocalValue + 3
  }

  // define a function
  def myFunction(x: Int, y: String): String = {
    y + " " + x
  }

  // recursive functions
  def factorial(n: Int): Int = 
    if (n <= 1) 1
    else n * factorial(n - 1)
  
  /*
  factorial(5) = 5 * factorial(4) = 5 * 24 = 120
  factorial(4) = 4 * factorial(3) = 4 * 6
  factorial(3) = 3 * factorial(2) = 3 * 2
  factorial(2) = 2 * factorial(1) = 2 * 1
  factorial(1) = 1 
  if you wanted to compute factorial of 5 you would need to go back on the start and compute upwards until you get to factorial of 5
  */

  // In Scala, we don't use loops or iteration, we use RECURSION!
  // It can be done but it's heavily discouraged! - think with functions or recursion 

  // the return Unit type = no meaningful value === "void" in other languages
  // type of SIDE EFFECTS
  println("I love Scala") // === console.log. This does not return any meaningful value. in Scala they return Unit

  // if you want to define a function returning unit 
  def myUnitReturningFunction(): Unit = {
    println("I don't love returning Unit")
  }

  val theUnit = () // '()' is the same value returned by println and other functions returning unit
}

