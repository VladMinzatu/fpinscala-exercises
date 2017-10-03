package exercises.ch05

object Ex06 {

  // method implemented in Stream.scala

  def main(args: Array[String]): Unit = {
    println(Stream.squaresTo10().headOption())
    println(Stream.empty.headOption())
  }
}
