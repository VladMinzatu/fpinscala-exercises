package exercises.ch03

object Ex27 {

  def depth[A](t: Tree[A]): Int = t match{
    case Leaf(x) => 0
    case Branch(l, r) => 1 + (depth(l) max depth(r))
  }

  def main(args: Array[String]): Unit = {
    println(depth(Branch(Leaf(4), Branch(Leaf(5), Branch(Leaf(3), Leaf(2))))))
  }
}
