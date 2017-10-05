package exercises.ch06

object Ex01 {

  def nonNegativeInt(rng: RNG): (Int, RNG) = {
    val (n, newRng) = rng.nextInt
    val pn = if(n == Int.MinValue) 0 else if(n < 0) -n else n
    (pn, newRng)
  }

  def main(args: Array[String]): Unit = {
    println(nonNegativeInt(SimpleRNG(1234567)))
  }
}
