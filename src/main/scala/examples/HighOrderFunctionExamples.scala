package examples

object HighOrderFunctionExamples {

  println("***************** HighOrderFunctionExamples *******************")

  functionAsParam(3, (x) => s"Hello message $x")

  // create Hello fumnction and call it
  val f = functionThatReturnsFunction
  println(f("World"))

  // or like this
  println(functionThatReturnsFunction()("Moon"))

  // test lambdas with collections
  val randomStringNumbers = List("2", "3", "4", "8", "1", "42", "9", "12")
  // convert String to int and sort them and return only even numbers
  val result = randomStringNumbers.map(s => s.toInt).sortWith(_ < _).filter(i => i % 2 == 0)
  println(result)
  println(result.sum) // just for fun


  def functionAsParam(count: Int, f: (Int) => String): Unit = {
    for (a <- 1 until count + 1)
      println(f(a))
  }

  def functionThatReturnsFunction(): (String) => String = {
    println("return a Hello function")
    (x) => s"Hello, $x"
  }
}
