package exercises.ch03

object Ex07 {

  def main(args: Array[String]): Unit = {
    println(List.product2(List(1.0,2.0,3.0,4.0)))
    // The parameter f cannot terminate the recursion early because it is only applied
    // once the whole list is traversed
  }
}
