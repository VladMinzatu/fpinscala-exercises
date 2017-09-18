package exercises.ch03

object Ex04 {

  @annotation.tailrec
  def drop[A](l: List[A], n: Int): List[A] = l match{
    case Nil => Nil
    case Cons(x, xs) => if(n <= 0) l else drop(xs, n-1)
  }

  def main(args: Array[String]): Unit = {
    println("-- For Empty List:")
    println(drop(List(), 0))
    println(drop(List(), 1))
    println(drop(List(), 2))
    println(drop(List(), 3))
    println()

    println("-- For List(1):")
    println(drop(List(1), 0))
    println(drop(List(1), 1))
    println(drop(List(1), 2))
    println(drop(List(1), 3))

    println("-- For List(1,2):")
    println(drop(List(1,2), 0))
    println(drop(List(1,2), 1))
    println(drop(List(1,2), 2))
    println(drop(List(1,2), 3))

    println("-- For List(1,2,3):")
    println(drop(List(1,2,3), 0))
    println(drop(List(1,2,3), 1))
    println(drop(List(1,2,3), 2))
    println(drop(List(1,2,3), 3))
  }
}
