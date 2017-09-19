package exercises.ch03

object Ex22 {

  def head[A](l: List[A]): Option[A] = l match{
    case Nil => None
    case Cons(x, xs) => Some(x)
  }

  // the length of the first list will dictate how far the addition goes
  def zipAdd(a: List[Int], b: List[Int]): List[Int] = a match{
    case Nil => Nil
    case Cons(x, xs) => Cons(x + head(b).getOrElse(0), zipAdd(xs, Ex02.tail(b)))
  }

  def main(args: Array[String]): Unit = {
    println(zipAdd(List(), List(1)))
    println(zipAdd(List(1), List(1)))
    println(zipAdd(List(1,2), List(1)))
    println(zipAdd(List(1,2,3), List(1)))
    println(zipAdd(List(1,2), List(1,2)))
    println(zipAdd(List(1,2), List(1,2,3)))
  }
}
