package examples

import scala.collection.parallel.immutable.ParVector
import scala.collection.parallel.immutable._

object ParallelCollectionExamples {

  // for some reason this does not work on Object body
  def doIt(): Unit = {
    val start = System.currentTimeMillis()
    println("***************** ParallelCollectionExamples *******************")
    val list = (1 to 25).toVector


    list.par.foreach(v => {
      print(v +" ")
      sleepRandom
    })
    println(s"done in ${System.currentTimeMillis() - start} millis" )
  }

  def sleepRandom() = {
    val r = new scala.util.Random
    Thread.sleep(20 + r.nextInt((300 - 100) + 1))
  }

}
