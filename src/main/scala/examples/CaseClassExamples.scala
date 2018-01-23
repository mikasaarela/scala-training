package examples

import models.Worker
import models.WorkPlace

object CaseClassExamples {

  println("***************** CaseClassExamples *******************")


  // simple define with default null workPlace
  val matti = Worker("Matti", 40)
  println(matti)

  // define Worker with parameter names
  val mika = Worker(
    name = "Mika",
    age = 39,
    worksAt = WorkPlace(
      name = "Sysart",
      address = "Peltola"
    )
  )
  println(mika)
}
