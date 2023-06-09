package chapter04

object Test03_WhileLoop {
  def main(args: Array[String]): Unit = {
    //while
    var a: Int = 10
    while (a >= 1) {
      println("this is a while loop: " + a)
      a -= 1
    }

    //0的时候还会执行一次
    var b: Int = 0
    do {
      println("this is a while loop: " + b)
      b -= 1
    } while (b > 0)
  }
}
