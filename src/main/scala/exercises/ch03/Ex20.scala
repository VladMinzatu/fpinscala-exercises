package exercises.ch03

object Ex20 {

  def flatMap[A,B](as: List[A])(f: A => List[B]): List[B] = as match {
    case Nil => Nil
    case Cons(x, xs) => Ex15.append(f(x), flatMap(xs)(f))
  }

  def main(args: Array[String]): Unit = {
    println(flatMap(List(1,2,3))(i => List(i,i)))
  }
}
