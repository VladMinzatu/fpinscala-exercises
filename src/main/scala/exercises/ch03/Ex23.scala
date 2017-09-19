package exercises.ch03

object Ex23 {

  // now the length is given by the shorter list
  def zipWith[A](a: List[A], b: List[A])(f: (A,A) => A): List[A] = (a, b) match{
    case (Nil, _) => Nil
    case (_, Nil) => Nil
    case (Cons(x, xs), Cons(y, ys)) => Cons(f(x, y), zipWith(xs, ys)(f))
  }

  def main(args: Array[String]): Unit ={
    println(zipWith(List(), List(1))(_+_))
    println(zipWith(List(1), List(1))(_+_))
    println(zipWith(List(1,2), List(1))(_+_))
    println(zipWith(List(1,2,3), List(1))(_+_))
    println(zipWith(List(1,2), List(1,2))(_+_))
    println(zipWith(List(1,2), List(1,2,3))(_+_))
  }
}
