package exercises.ch02

object Ex03 {

  def curry[A,B,C](f: (A, B) => C): A => (B => C) =
    (a: A) => ((b: B) => f(a,b))
  // heh?! Can we come up with a concrete example?

  def main(args: Array[String]): Unit = {
    val fun = curry[Int, Double, String]((i: Int, d: Double) => s"$d($i)")
    // fun is a function that takes an int and returns a function that takes a double and
    // returns a string with said double followed by said int between brackets

    val fun5 = fun(5)
    // fun5 is a function that takes a double and returns a string containing
    // said double followed by "(5)"

    println(fun5(3.14))
    // well, that was useful!
  }
}
