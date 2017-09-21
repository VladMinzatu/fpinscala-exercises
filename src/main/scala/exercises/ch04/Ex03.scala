package exercises.ch04

object Ex03 {

  def map2[A,B,C](a: Option[A], b: Option[B])(f: (A,B) => C): Option[C] = (a,b) match {
    case (None, _) => None
    case (_, None) => None
    case (Some(a),Some(b)) => Some(f(a,b))
  }

  def main(args: Array[String]): Unit = {
    println(map2[Int,Int,Int](None, Some(5))((a,b) => a+b))
    println(map2[Int,Int,Int](Some(5), None)((a,b) => a+b))
    println(map2[Int,Int,Int](Some(5), Some(4))((a,b) => a+b))
  }
}
