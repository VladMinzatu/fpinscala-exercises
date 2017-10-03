package exercises.ch05

object Ex05 {

  // method implemented in Stream.scala

  def main(args: Array[String]): Unit = {
    println(Stream.squares().takeWhile2(x => x <= 625).toList)
  }
}
