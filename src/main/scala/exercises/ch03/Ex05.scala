package exercises.ch03

object Ex05 {

  @annotation.tailrec
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case Nil => Nil
    case Cons(x, xs) => if(f(x)) dropWhile(xs, f) else l
  }

  def main(args: Array[String]): Unit = {
    println(dropWhile(List(), (x: Int) => true))
    println(dropWhile(List(1), (x: Int) => true))
    println(dropWhile(List(1,2), (x: Int) => true))
    println(dropWhile(List(1,2,-1,3), (x: Int) => x > 0))
  }
}
