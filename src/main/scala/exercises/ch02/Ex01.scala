package exercises.ch02

object Ex01 {

  def fib(n: Int): Int = {
    @annotation.tailrec
    def fibHelper(prev: Int, curr: Int, remaining: Int): Int = {
      if(remaining == 0) curr
      else fibHelper(curr, curr + prev, remaining - 1)
    }

    if(n <= 1) 0
    else if(n == 2) 1
    else fibHelper(0, 1, n - 2)
  }

  def main(args: Array[String]): Unit = {
    (1 to 20).foreach(i => print("%d ".format(fib(i))))
  }
}
