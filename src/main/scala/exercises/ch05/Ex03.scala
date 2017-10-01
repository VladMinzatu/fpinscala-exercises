package exercises.ch05

object Ex03 {

  // method implemented in Stream.scala

  def main(args: Array[String]): Unit = {
    println(Stream.squares().takeWhile(x => x <= 625).toList)
  }
}
