package examples

import models.Person

object TupleExamples {

  println("***************** TupleExample *******************")

  val (father, mother, children) = familyOfThree("Matti", "Maija")
  println(father)
  println(mother)
  println(children)


  def familyOfThree(fatherName: String, motherName: String): (Person, Person, Person) = {
    println("return a Tuple family of three")
    val father = Person(fatherName)
    val mother = Person(motherName)

    val child = father + mother // see + infix operator in Person
    (father, mother, child)
  }

}
