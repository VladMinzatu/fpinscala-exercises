package exercises.ch03

import exercises.ch03.Ex27.depth

object Ex28 {

  def map[A,B](t: Tree[A])(f: A => B): Tree[B] = t match{
    case Leaf(x) => Leaf(f(x))
    case Branch(l, r) => Branch(map(l)(f), map(r)(f))
  }

  def main(args: Array[String]): Unit = {
    println(map(Branch(Leaf(4), Branch(Leaf(5), Branch(Leaf(3), Leaf(2)))))(x => x+1))
  }
}
