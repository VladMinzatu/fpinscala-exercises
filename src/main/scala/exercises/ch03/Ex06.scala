package exercises.ch03

object Ex06 {

  def init[A](l: List[A]): List[A] = l match {
    case Nil => Nil
    case Cons(x, Nil) => Nil
    case Cons(x, xs) => Cons(x, init(xs))
  }

  def main(args: Array[String]): Unit = {
    println(init(List()))
    println(init(List(1)))
    println(init(List(1,2)))
    println(init(List(1,2,3)))
    println(init(List(1,2,3,4)))
  }
}
