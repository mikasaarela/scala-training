package models

case class Person(val name: String, val age: Int = 0) {

  def +(other: Person) =
    Person(s"children of $name and ${other.name}")

}
