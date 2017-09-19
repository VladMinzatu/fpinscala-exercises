package exercises.ch03

object Ex19 {

  def filter[A](as: List[A])(f: A => Boolean): List[A] = as match {
    case Nil => Nil
    case Cons(x, xs) => if(f(x)) Cons(x, filter(xs)(f)) else filter(xs)(f)
  }

  def main(args: Array[String]): Unit = {
    println(filter(List(1))(x => x % 2 == 0))
    println(filter(List(1,2))(x => x % 2 == 0))
    println(filter(List(1,2,3))(x => x % 2 == 0))
    println(filter(List(1,2,3,4))(x => x % 2 == 0))
    println(filter(List(1,2,3,4,5))(x => x % 2 == 0))
    println(filter(List(1,2,3,4,5,6))(x => x % 2 == 0))
  }
}
