package com.rockthejvm

object ObjectOrientation extends App {
  
  // class and instance
  class Animal {
    // define fields
    val age: Int = 0
    //define methods
    def eat() = println("I'm eating")
  }

  val anAnimal = new Animal

  // inheritance
  // extending an Animal means inheriting all its members and methods that it contains
  class Dog(val name: String) extends Animal // constructor definition

  val aDog = new Dog("Lassie")

  //constructor arguments are NOT fields: so you need to put a val before the constructor argument 
  aDog.name

  // subtype polymorphism
  val aDeclaredAnimal: Animal = new Dog("Hachi")
  aDeclaredAnimal.eat() // the most derived method will be called at runtime 

  // abstract class
  abstract class WalkingAnimal {
    protected val hasLegs = true // all fields and methods are public by default, but you can restrict that by adding private (only the class has access to this member or method) or protected (this class and all its descendants have access to this method but not outside of the class)
    def walk(): Unit
  }

  // "interface" = ultimate abstract type, meaning you can leave everything unimplemented
  trait Carnivore {
    def eat(animal: Animal): Unit
  }
  // we use traits to denote characteristics of objects that we can then later use and implement in our concrete classes

  // scala has single-class inheritance, and multi-trait inheritance (when we add a trait we call it "mixing")
  class Crocodile extends Animal with Carnivore {
    override def eat(animal: Animal): Unit = println("I am eating you, animal!") // when we implement a method that's also present in a supertype, we call that an override, so we can implement the method from Carnivore
    override def eat(): Unit = super.eat()
    // we can also override a concrete method from Animal to override the existing eat method so we can provide another implementation for the eat method in the class Animal
  }

}
