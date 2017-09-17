package exercises.ch02

object Ex05 {

  def compose[A,B,C](f: B => C, g: A => B): A => C =
    (a: A) => f(g(a))

  def main(args: Array[String]): Unit = {
    println(compose((x: Int) => x + 10, (x: Int) => x * x)(5))

    // or using the compose provided by Scala for Function1
    println((((x: Int) => x + 10) compose ((x: Int) => x * x))(5))
  }
}
