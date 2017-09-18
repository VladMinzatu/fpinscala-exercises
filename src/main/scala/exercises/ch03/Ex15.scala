package exercises.ch03

object Ex15 {

  def append[A](l1: List[A], l2: List[A]): List[A] =
    l1 match {
      case Nil => l2
      case Cons(x,xs) => Cons(x, append(xs, l2))
    }

  def concat[A](l: List[List[A]]): List[A] =
    List.foldRight(l, List[A]())(append)

  def main(args: Array[String]): Unit = {
    println(concat(List(List(), List())))
    println(concat(List(List(), List(1))))
    println(concat(List(List(1), List())))
    println(concat(List(List(1), List(2))))
    println(concat(List(List(1,2,3), List(4,5))))
  }
}
