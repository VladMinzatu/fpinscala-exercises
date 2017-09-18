package exercises.ch03

object Ex09 {

  def length[A](as: List[A]): Int = List.foldRight(as, 0)((a: A, b: Int) => 1 + b)

  def main(args: Array[String]): Unit = {
    println(length(List()))
    // folrRight(Nil, 0) -> 1 + 0

    println(length(List(1)))
    // folrRight(Cons(1, Nil), 0) -> 1 + foldRight(Nil, 0)
    //                            -> 1 + 0

    println(length(List(1,2)))
    // folrRight(Cons(1, Cons(2, Nil)), 0) -> 1 + foldRight(Cons(2, Nil), 0)
    //                                    -> 1 + 1 + foldRight(Cons(Nil), 0)
    //                                    -> 1 + 1 + 1

    println(length(List(1,2,3)))
    println(length(List(1,2,3,4)))
    println(length(List(1,2,3,4,5)))
  }
}
