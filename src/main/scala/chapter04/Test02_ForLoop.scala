package chapter04

object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
    //1.范围遍历
    for (i <- 1 to 10) {
      println(i + ". hello world")
    }
    println("=" * 18)
    for (i: Int <- 1.to(10)) {
      println(i + ". hello world")
    }
    println("=" * 18)
    for (i <- 1 until 10) {
      println(i + ". hello world")
    }
    println("=" * 18)

    //2.集合遍历
    for (i <- Array(12, 34, 53)) {
      println(i)
    }
    println("=" * 18)
    for (i <- List(12, 34, 53)) {
      println(i)
    }
    println("=" * 18)
    for (i <- Set(12, 34, 53)) {
      println(i)
    }
    println("=" * 18)

    //3.循环守卫

    for (i <- 1 to 10) {
      if (i != 5) {
        println(i)
      }
    }
    println("=" * 18)
    for (i <- 1 to 10 if i != 5) {
      println(i)
    }
    println("=" * 18)

    //4.循环步长，步长不能为0
    for (i <- 1 to 10 by 2) {
      println(i)
    }
    println("=" * 18)
    for (i <- 13 to 30 by 3) {
      println(i)
    }
    println("=" * 18)
    //倒叙
    for (i <- 30 to 13 by -3) {
      println(i)
    }
    println("=" * 18)

    //5.循环嵌套
    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        println("i=" + i + ", j=" + j)
      }
    }
    println("=" * 18)
    for (i <- 1 to 3; j <- 1 to 3) {
      println("i=" + i + ", j=" + j)
    }
    println("=" * 18)
    //输出九九乘法表
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(s"$j * $i = ${i * j} \t")
      }
      println()
    }
    println("=" * 18)
    for (i <- 1 to 9; j <- 1 to i) {
      print(s"$j * $i = ${i * j} \t")
      if (i == j)
        println()
    }
    println("=" * 18)

    //6.引入变量
    for (i <- 1 to 10) {
      val j = 10 - i
      println("i=" + i + ", j=" + j)
    }
    println("=" * 18)
    for (i <- 1 to 10; j = 10 - i) {
      println("i=" + i + ", j=" + j)
    }
    println("=" * 18)
    for {
      i <- 1 to 10;
      j = 10 - i} {
      println("i=" + i + ", j=" + j)
    }
    println("=" * 18)

    //7.循环返回值,默认都是空
    val a = for (i <- 1 to 10) {
      println(i)
    }
    println("a= " + a)
    println("=" * 18)

    val b = for (i <- 1 to 10) yield i * 2
    println("b= " + b)
    println("=" * 18)

  }
}
