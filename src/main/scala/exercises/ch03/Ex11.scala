package exercises.ch03

object Ex11 {

  def sum(ints: List[Int]): Int = List.foldLeft(ints, 0)(_ + _)

  def product(ds: List[Double]): Double = List.foldLeft(ds, 1.0)(_ * _)

  def length[A](as: List[A]): Int = List.foldLeft(as, 0)((b, a) => 1 + b)

  def main(args: Array[String]): Unit = {
    println("Sums:")
    println(sum(List()))
    println(sum(List(1)))
    println(sum(List(1,2)))
    println(sum(List(1,2,3)))
    println(sum(List(1,2,3,4)))

    println("Products:")
    println(product(List()))
    println(product(List(1)))
    println(product(List(1,2)))
    println(product(List(1,2,3)))
    println(product(List(1,2,3,4)))

    println("Lengths:")
    println(length(List()))
    println(length(List(1)))
    println(length(List(1,2)))
    println(length(List(1,2,3)))
    println(length(List(1,2,3,4)))
  }
}
