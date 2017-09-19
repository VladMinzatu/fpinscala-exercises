package exercises.ch03

object Ex25 {

  def size[A](t: Tree[A]): Int = t match {
    case Leaf(_) => 1
    case Branch(l, r) => size(l) + size(r)
  }

  def main(args: Array[String]): Unit ={
    println(size(Branch(Branch(Leaf('A'), Leaf('B')), Leaf('C'))))
  }
}
