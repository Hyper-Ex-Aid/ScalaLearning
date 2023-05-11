package chapter04

import scala.util.control.Breaks

object Test04_Break {
  def main(args: Array[String]): Unit = {
    //1.采用抛出异常的方式，退出循环
    try {
      for (i <- 0 until 5) {
        if (i == 3)
          throw new RuntimeException
        println(i)
      }
    } catch {
      case exception: Exception => //什么都不做，只是退出循环
    }

    //2.使用scala中的Breaks类的break方法，实现异常的抛出和捕捉
    Breaks.breakable(
      for (i <- 0 to 5) {
        if (i == 3)
          Breaks.break()
        println(i)
      }
    )

    println("这是循环外的代码")

  }
}
