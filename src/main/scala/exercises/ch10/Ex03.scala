package exercises.ch10

object Ex03 {

  def endoMonoid[A]: Monoid[A => A] = new Monoid[(A) => A] {
    override def op(a1: (A) => A, a2: (A) => A): (A) => A = a1 andThen a2
    override def zero: (A) => A = (a => a)
  }

  def main(args: Array[String]): Unit = {
    println(endoMonoid[Int].zero(1))
    println(endoMonoid[Int].op(x => x*x, endoMonoid[Int].zero)(2))
  }
}
