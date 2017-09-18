package exercises.ch03

object Ex08 {

  def main(args: Array[String]): Unit = {
    println(List.foldRight(List(1,2,3), Nil: List[Int])(Cons(_,_)))
    // creates a copy of the input list
  }
}
