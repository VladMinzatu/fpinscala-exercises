package exercises.ch02

object Ex04 {

  def uncurry[A,B,C](f: A => B => C): (A,B) => C =
    (a: A, b: B) => f(a)(b)

  def main(args: Array[String]): Unit = {
    // Let's say again A=Int, B=Double, C=String
    val f = (i: Int) => (d: Double) => s"$d($i)"
    val uncurriedF = uncurry(f)
    println(uncurriedF(5, 3.14))
    // starting to get the hang of this
  }
}
