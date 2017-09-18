package exercises.ch03

object Ex14 {

  def append[A](as: List[A], x: A): List[A] = List.foldRight(as, List(x))((a,b) => Cons(a, b))

  def main(args: Array[String]): Unit = {
    println(append(List(), 1))
    println(append(List(1), 2))
    println(append(List(1,2), 3))
    println(append(List(1,2,3), 4))
  }
}
