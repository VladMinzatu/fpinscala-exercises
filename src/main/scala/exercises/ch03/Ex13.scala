package exercises.ch03

object Ex13 {

 def foldRight[A,B](as: List[A], z: B)(f: (A,B) => B): B = List.foldLeft(Ex12.reverse(as), z)((a,b) => f(b,a))

  def main(args: Array[String]): Unit = {
    println(foldRight(List(1), 0)(_ + _))
    println(foldRight(List(1,2), 0)(_ + _))
    println(foldRight(List(1,2,3), 0)(_ + _))
    println(foldRight(List(1,2,3,4), 0)(_ + _))
    println(foldRight(List(1,2,3,4,5), 0)(_ + _))
  }
}
