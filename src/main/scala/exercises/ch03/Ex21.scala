package exercises.ch03

object Ex21 {

  def filter[A](as: List[A])(f: A => Boolean): List[A] =
    Ex20.flatMap(as)(a => if(f(a)) List(a) else Nil)

  def main(args: Array[String]): Unit = {
    println(filter(List(1))(x => x % 2 == 0))
    println(filter(List(1,2))(x => x % 2 == 0))
    println(filter(List(1,2,3))(x => x % 2 == 0))
    println(filter(List(1,2,3,4))(x => x % 2 == 0))
    println(filter(List(1,2,3,4,5))(x => x % 2 == 0))
    println(filter(List(1,2,3,4,5,6))(x => x % 2 == 0))
  }
}
