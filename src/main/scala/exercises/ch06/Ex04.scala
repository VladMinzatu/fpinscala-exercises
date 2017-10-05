package exercises.ch06

import scala.annotation.tailrec

object Ex04 {

  def ints(count: Int)(rng: RNG): (List[Int], RNG) = {
    @tailrec
    def go(count: Int, l: List[Int])(rng: RNG): (List[Int], RNG) = {
      if(count == 0) (l, rng)
      else {
        val (n, newRng) = rng.nextInt
        go(count -1, n :: l)(newRng)
      }
    }
    go(count, List())(rng)
  }

  def main(args: Array[String]): Unit = {
    println(ints(10)(SimpleRNG(1)))
  }
}
