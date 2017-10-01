package exercises.ch05

object Ex02 {

  // method implemented in Stream.scala

  def main(args: Array[String]): Unit = {
    println(Stream.squares().take(20).toList)
    println(Stream.squares().drop(10).take(10).toList)
  }
}
