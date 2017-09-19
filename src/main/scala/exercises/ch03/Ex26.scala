package exercises.ch03

object Ex26 {

  def maximum(t: Tree[Int]): Int = t match{
    case Leaf(x) => x
    case Branch(l, r) => maximum(l) max maximum(r)
  }

  def main(args: Array[String]): Unit = {
    println(maximum(Branch(Leaf(4), Branch(Leaf(5), Branch(Leaf(3), Leaf(2))))))
  }
}
