package exercises.ch10

object Ex05 {

  def foldMap[A,B](as: List[A], m: Monoid[B])(f: A => B): B = {
    as.map(f).foldLeft(m.zero)(m.op)
  }

  // or without generating an intermediate list...
  def foldMap2[A,B](as: List[A], m: Monoid[B])(f: A => B): B = {
    as.foldLeft(m.zero)((b,a) => m.op(b, f(a)))
  }

  def main(args: Array[String]): Unit = {
    println(foldMap(List(1.0,2.0,3.0,4.0,5.0),Ex01.intAddition)(x => x.toInt))
    println(foldMap2(List(1.0,2.0,3.0,4.0,5.0),Ex01.intAddition)(x => x.toInt))
  }
}
