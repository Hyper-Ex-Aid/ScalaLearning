package chapter05

object Test10_ControlAbstract {
  def main(args: Array[String]): Unit = {
    //1.传值参数
    def f0(a: Int): Unit = {
      println("a: " + a)
      println("a: " + a)
    }

    f0(23)

    def f1(): Int = {
      println("f1被调用")
      12
    }

    f0(f1())

    //2.传名参数,传递的不再是具体的值，而是代码块
    def f2(a: => Int): Unit = {
      println("a: " + a)
      println("a: " + a)
    }

    //a被调用几次，f1被调用几次，相当于把f2中调用的a全部替换为f1的代码块
    f2(f1())
    f2(23)
  }
}
