package exercises.ch05

object Ex07 {

  // method implemented in Stream.scala

  def main(args: Array[String]): Unit = {
    println(Stream.squaresTo10().map(x => s"Nr_$x").toList)
    println(Stream.squaresTo10().filter(x => x > 5).toList)
  }
}
