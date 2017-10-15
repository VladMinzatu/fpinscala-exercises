package exercises.ch10

object Ex01 {

  val intAddition: Monoid[Int] = new Monoid[Int]{
    override def op(i1: Int, i2: Int) = i1 + i2
    override def zero = 0
  }

  val intMultiplication: Monoid[Int] = new Monoid[Int]{
    override def op(i1: Int, i2: Int) = i1 * i2
    override def zero = 1
  }

  val booleanOr: Monoid[Boolean] = new Monoid[Boolean] {
    override def op(b1: Boolean, b2: Boolean): Boolean = b1 || b2
    override def zero: Boolean = false
  }

  val booleanAnd: Monoid[Boolean] = new Monoid[Boolean]{
    override def op(b1: Boolean, b2: Boolean): Boolean = b1 && b2
    override def zero: Boolean = true
  }
}
