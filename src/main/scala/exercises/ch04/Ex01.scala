package exercises.ch04

object Ex01 {

  // methods were implemented in Option.scala

  def main(args: Array[String]): Unit = {
    val empty: Option[Int] = None
    val fiveOpt: Option[Int] = Some(5)

    println("--map")
    println(empty.map(x => x * x))
    println(fiveOpt.map(x => x * x))

    println("--flatMap")
    println(empty.flatMap(x => None))
    println(fiveOpt.flatMap(x => None))

    println(empty.flatMap(x => Some(x * x)))
    println(fiveOpt.flatMap(x => Some(x * x)))

    println("--getOrElse")
    println(empty.getOrElse(1))
    println(fiveOpt.getOrElse(1))

    println("--orElse")
    println(empty.orElse(None))
    println(fiveOpt.orElse(None))

    println(empty.orElse(Some(1)))
    println(fiveOpt.orElse(Some(1)))

    println("--filter")
    println(empty.filter(x => x > 10))
    println(fiveOpt.filter(x => x > 10))
    println(fiveOpt.filter(x => x > 1))
  }
}
