package exercises.ch03

object Ex02 {

  def tail[A](l: List[A]): List[A] = l match {
    case Nil => Nil
    case Cons(x, xs) => xs
  }

  def main(args: Array[String]): Unit = {
    println(tail(List()))
    println(tail(List(1)))
    println(tail(List("hello", "world")))
  }
}
