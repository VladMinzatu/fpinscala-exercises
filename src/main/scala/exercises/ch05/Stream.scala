package exercises.ch05;

sealed trait Stream[+A]{
  def toList: List[A] = this match {
    case Empty => Nil
    case Cons(h, t) => h() :: t().toList
  }

  def take(n: Int): Stream[A] = this match {
    case Cons(h,t) if n <= 0 => Stream.empty
    case Cons(h, t) => Stream.cons(h(), t().take(n-1))
    case _ => Stream.empty
  }

  def drop(n: Int): Stream[A] = this match {
    case Cons(h,t) if n <= 0 => Stream.cons(h(), t())
    case Cons(h, t) => t().drop(n-1)
    case _ => Stream.empty
  }

  def takeWhile(p: A => Boolean): Stream[A] = this match {
    case Cons(h,t) if p(h()) => Stream.cons(h(), t().takeWhile(p))
    case _ => Stream.empty
  }
}

case object Empty extends Stream[Nothing]

case class Cons[+A](h: () => A, t: () => Stream[A]) extends Stream[A]

object Stream{
  def cons[A](hd: => A, tl: => Stream[A]): Stream[A] = {
    lazy val head = hd
    lazy val tail = tl
    Cons(() => head, () => tail)
  }

  def empty[A]: Stream[A] = Empty

  def apply[A](as: A*): Stream[A] =
    if (as.isEmpty) empty else cons(as.head, apply((as.tail: _*)))

  def squaresTo10(x: Int): Stream[Int] = {
    if(x > 10) Stream.empty else Stream.cons(x*x, squaresTo10((x + 1)))
  }

  def squares(x: Int = 1): Stream[Int] = {
    Stream.cons(x*x, squares((x + 1)))
  }
}
