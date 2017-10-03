package exercises.ch05

object Ex04 {

  // method implemented in Stream.scala

  def main(args: Array[String]): Unit = {
    println(Stream.squaresTo10().forAll(x => x < 5))
  }
}
