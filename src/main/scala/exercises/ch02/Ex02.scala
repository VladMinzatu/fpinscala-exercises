package exercises.ch02

object Ex02 {

  def isSorted1[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int, acc: Boolean): Boolean = {
      if(n == 0) acc
      else loop(n - 1, acc && ordered(as(n-1), as(n)))
    }

    loop(as.length - 1, true)
  }

  def isSorted2[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    (0 until as.length - 1).map(i => ordered(as(i), as(i + 1))).reduce(_ && _)
  }

  def main(args: Array[String]): Unit = {
    println("v1:")
    println(isSorted1[Int](Array(1,2,3,4,5,6,7), _<_)) //true
    println(isSorted1[Int](Array(1,2,3,4,5,6,7), _>_)) // false
    println(isSorted1[Int](Array(7,5,4,2,1), _>_)) // true

    println("v2:")
    println(isSorted2[Int](Array(1,2,3,4,5,6,7), _<_)) //true
    println(isSorted2[Int](Array(1,2,3,4,5,6,7), _>_)) // false
    println(isSorted2[Int](Array(7,5,4,2,1), _>_)) // true
  }

}
