package exercises.ch03

object Ex12 {

  def reverse[A](as: List[A]): List[A] = List.foldLeft(as, List[A]())((l, a) => Cons(a, l))

  def main(args: Array[String]): Unit = {
    println(reverse(List()))
    println(reverse(List(1)))
    println(reverse(List(1,2)))
    println(reverse(List(1,2,3)))
    println(reverse(List(1,2,3,4)))
    // foldLeft(List(1,2,3,4), Nil) ->
    // foldLeft(List(2,3,4), Cons(1,Nil))
    // foldLeft(List(3,4), Cons(2,Cons(1,Nil))
    // foldLeft(List(4), Cons(3,Cons(2,Cons(1,Nil)))
    // foldLeft(Nil, Cons(4,Cons(3,Cons(2,Cons(1,Nil))))
    // Cons(4,Cons(3,Cons(2,Cons(1,Nil)))
  }
}
