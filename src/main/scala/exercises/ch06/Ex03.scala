package exercises.ch06

object Ex03 {

  def intDouble(rng: RNG): ((Int, Double), RNG) = {
    val (n, rng1) = rng.nextInt
    val (d, rng2) = Ex02.double(rng1)
    ((n,d), rng2)
  }

  def doubleInt(rng: RNG): ((Double, Int), RNG) = {
    val (n, rng1) = rng.nextInt
    val (d, rng2) = Ex02.double(rng1)
    ((d,n), rng2)
  }

  def double3(rng: RNG): ((Double, Double, Double), RNG) ={
    val (d1, rng1) = Ex02.double(rng)
    val (d2, rng2) = Ex02.double(rng1)
    val (d3, rng3) = Ex02.double(rng2)
    ((d1,d2,d3), rng3)
  }

  def main(args: Array[String]): Unit = {
    println(intDouble(SimpleRNG(12345)))
    println(doubleInt(SimpleRNG(12345)))
    println(double3(SimpleRNG(12345)))
  }
}
