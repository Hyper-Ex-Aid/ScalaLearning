package chapter05

//高阶函数
object Test06_HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f被调用")
      n + 1
    }

    val result: Int = f(123)
    println(result)

    def fun(): Int = {
      println("g被调用")
      1
    }

    fun()
    fun

    //1.函数可以作为值进行传递
    val f1: Int => Int = f
    val f2 = f _
    println(f1)
    println(f1(12))
    println(f2)
    println(f2(35))

    val f3 = fun
    val f4 = fun _
    println(f3)
    println(f4)

    //2.函数作为参数进行传递
    //定义二元计算函数
    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add, 12, 35))
    println(dualEval(_ + _, 12, 35))
    println(dualEval((a, b) => a + b, 12, 35))

    //3.函数可以作为函数的返回值返回
    def f5(): Int => Unit = {
      def f6(a: Int): Unit = {
        println("f6被调用 " + a)
      }
      f6
    }
    val f6=f5()
    println(f6)
    println(f6(25))
  }
}
