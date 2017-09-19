package exercises.ch03

object Ex16 {

  def map[A,B](l: List[A])(f: A => B): List[B] = l match {
    case Nil => Nil
    case Cons(x, xs) => Cons(f(x), map(xs)(f))
  }

  def main(args: Array[String]): Unit = {
    println(map(List[Int]())(x => x + 1))
    println(map(List(1))(x => x + 1))
    println(map(List(1,2))(x => x + 1))
    println(map(List(1,2,3))(x => x + 1))
    println(map(List(1,2,3,4))(x => x + 1))
  }
}
