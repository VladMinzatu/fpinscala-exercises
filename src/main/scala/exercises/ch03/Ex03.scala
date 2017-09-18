package exercises.ch03

object Ex03 {

  def setHead[A](l: List[A], newHead: A) = l match{
    case Nil => Cons(newHead, Nil)
    case Cons(x, xs) => Cons(newHead, xs)
  }

  def main(args: Array[String]): Unit = {
    println(setHead(Nil, 10))
    println(setHead(List(), 10))
    println(setHead(List(1), 10))
    println(setHead(List(1,2), 10))
    println(setHead(List(1,2,3), 10))
  }
}
