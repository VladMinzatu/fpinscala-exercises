package exercises.ch06

object Ex02 {

  def double(rng: RNG): (Double, RNG) = {
    val (n, newRng) = Ex01.nonNegativeInt(rng)
    (n.toDouble / (Int.MaxValue.toDouble + 1), newRng)
  }

  def main(args: Array[String]): Unit = {
    println(double(SimpleRNG(123456789)))
  }
}
