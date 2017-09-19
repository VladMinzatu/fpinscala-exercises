package exercises.ch03

object Ex17 {

  def main(args: Array[String]): Unit = {
    println(Ex16.map(List[Double]())(d => d.toString))
    println(Ex16.map(List(1.0))(d => d.toString))
    println(Ex16.map(List(1.0, 2.0))(d => d.toString))
  }
}
