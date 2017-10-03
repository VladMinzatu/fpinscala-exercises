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

  def foldRight[B](z: => B)(f: (A, => B) => B): B = this match {
    case Cons(h, t) => f(h(), t().foldRight(z)(f))
    case _ => z
  }

  def exists(p: A => Boolean) : Boolean =
    this.foldRight(false)((a, b) => p(a) || b)

  def forAll(p: A => Boolean): Boolean =
    this.foldRight(true)((a,b) => p(a) && b)

  def takeWhile2(p: A => Boolean): Stream[A] =
    this.foldRight(Stream.empty[A])((a,b) => if(p(a)) Stream.cons(a, b) else Stream.empty)

  def headOption(): Option[A] =
    this.foldRight(Option.empty[A])((a,b) => Some(a))

  def map[B](f: A => B): Stream[B] =
    this.foldRight(Stream.empty[B])((a,b) => Stream.cons(f(a), b))

  def filter(p: A => Boolean): Stream[A] =
    this.foldRight(Stream.empty[A])((a,b) => if(p(a)) Stream.cons(a,b) else b)
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

  def squaresTo10(x: Int = 1): Stream[Int] = {
    println(x*x) // here so we can see what is being evaluated
    if(x > 10) Stream.empty else Stream.cons(x*x, squaresTo10((x + 1)))
  }

  def squares(x: Int = 1): Stream[Int] = {
    println(x*x)  // here so we can see what is being evaluated
    Stream.cons(x*x, squares((x + 1)))
  }
}
