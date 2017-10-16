package exercises.ch10

object Ex09 {

  val myMonoid: Monoid[Option[(Boolean, Int, Int)]] = new Monoid[Option[(Boolean, Int, Int)]] {
    override def op(l: Option[(Boolean, Int, Int)], r: Option[(Boolean, Int, Int)]): Option[(Boolean, Int, Int)] = (l, r) match {
      case (None, None) => None
      case (None, x) => x
      case (x, None) => x
      case (Some(t1), Some(t2)) => Some((t1._1 && t2._1 && t1._3 <= t2._2, t1._2, t2._3))
    }

    override def zero: Option[(Boolean, Int, Int)] = None
  }

  def f(x: Int) = Some((true, x, x))

  def main(args: Array[String]): Unit = {
    println(Ex07.foldMap(Array[Int](), myMonoid)(f).isEmpty)  // true
    println(Ex07.foldMap(Array(1), myMonoid)(f).get._1)  // true
    println(Ex07.foldMap(Array(1,2), myMonoid)(f).get._1)  // true
    println(Ex07.foldMap(Array(2,1), myMonoid)(f).get._1)  // false
    println(Ex07.foldMap(Array(2,1,3), myMonoid)(f).get._1)  // false
    println(Ex07.foldMap(Array(1,2,3), myMonoid)(f).get._1)  // true
    println(Ex07.foldMap(Array(1,3,2), myMonoid)(f).get._1)  // false
    println(Ex07.foldMap(Array(1,3,4,2,5), myMonoid)(f).get._1) // false
    println(Ex07.foldMap(Array(1,2,3,4,5), myMonoid)(f).get._1) // true
  }
}
