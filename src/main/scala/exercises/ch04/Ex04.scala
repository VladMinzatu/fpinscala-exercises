package exercises.ch04

object Ex04 {

  def sequence[A](a: List[Option[A]]): Option[List[A]] = {
    val newList = a.flatMap(a => a match {
      case None => List();
      case Some(aa) => List(aa)
    })
    if (newList.size < a.size) None else Some(newList)
  }

  def main(args: Array[String]): Unit = {
    println(sequence(List(None, Some(2), Some(3))))
    println(sequence(List(Some(1), None, Some(3))))
    println(sequence(List(Some(1), Some(2), Some(3))))
  }
}
