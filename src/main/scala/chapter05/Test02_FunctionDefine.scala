package chapter05

object Test02_FunctionDefine {
  def main(args: Array[String]): Unit = {
    //函数1：无参，无返回值
    def f1(): Unit = {
      println("1.无参，无返回值")
    }

    f1()
    println(f1())
    println("=" * 32)

    //函数2：无参，有返回值
    def f2(): Int = {
      println("2.无参，有返回值")
      return 12
    }

    f2()
    println(f2())
    println("=" * 32)

    //函数3：有参，无返回值
    def f3(name: String): Unit = {
      println("3：有参，无返回值" + name)
    }

    f3("Smoky")
    println(f3("Smoky"))
    println("=" * 32)

    //函数4：有参，有返回值
    def f4(name: String): String = {
      println("4：有参，有返回值" + name)
      return "hi" + name
    }

    f4("Smoky")
    println(f4("Smoky"))
    println("=" * 32)

    //函数5：多参，无返回值
    def f5(name1: String, name2: String): Unit = {
      println("5：多参，无返回值")
      println(s"${name1}和${name2}都是我的好朋友")
    }
    f5("Smoky","Smoking")
    println(f5("Smoky","Smoking"))
    println("=" * 32)

    //函数6：多参，有返回值
    def f6(name1: String, name2: String): Int = {
      println("6：多参，有返回值")
      println(s"${name1}和${name2}都是我的好朋友")
      return 36
    }
    f6("Smoky","Smoking")
    println(f6("Smoky","Smoking"))
    println("=" * 32)

  }

}
