package exercises.ch10

object Ex07 {

  def foldMap[A, B](as: IndexedSeq[A], m: Monoid[B])(f: A => B): B = {
    if(as.isEmpty) m.zero
    else if(as.size == 1) f(as(0))
    else {
      val (l,r) = as.splitAt(as.size/2)
      m.op(foldMap(l,m)(f), foldMap(r,m)(f))
    }

  }

  def main(args: Array[String]): Unit = {
    println(foldMap(Array[Double](), Ex01.intAddition)(x => x.toInt))
    println(foldMap(Array(1.0), Ex01.intAddition)(x => x.toInt))
    println(foldMap(Array(1.0,2.0), Ex01.intAddition)(x => x.toInt))
    println(foldMap(Array(1.0,2.0,3.0), Ex01.intAddition)(x => x.toInt))
    println(foldMap(Array(1.0,2.0,3.0,4.0), Ex01.intAddition)(x => x.toInt))
    println(foldMap(Array(1.0,2.0,3.0,4.0,5.0), Ex01.intAddition)(x => x.toInt))
  }
}
