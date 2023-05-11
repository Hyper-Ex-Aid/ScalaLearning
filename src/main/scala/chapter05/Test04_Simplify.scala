package chapter05

//函数至简原则
object Test04_Simplify {
  def main(args: Array[String]): Unit = {

    def f0(name: String): String = {
      return name
    }

    println(f0("Smoky0"))
    println("=" * 36)

    //1.return可以省略，Scala会使用函数体的最后一行代码作为返回值
    def f1(name: String): String = {
      name
    }

    println(f1("Smoky1"))
    println("=" * 36)

    //2.如果函数只有一行代码，可以省略花括号
    def f2(name: String): String = name

    println(f2("Smoky2"))
    println("=" * 36)

    //3.返回值类型如果能够推断出来，那么可以省略
    def f3(name: String) = name

    println(f3("Smoky3"))
    println("=" * 36)

    //4.如果有return，则不能省略返回值类型，必须制定
    //    def f4(name: String) = {
    //      return name
    //    }
    //
    //    println(f4("Smoky"))
    //    println("="*36)
    def f4(name: String): String = {
      return name
    }

    println(f4("Smoky4"))
    println("=" * 36)

    //5.如果函数明确声明unit，那么即使函数体中使用return关键字也不起作用
    def f5(name: String): Unit = {
      return name
    }

    println(f5("Smoky"))
    println("=" * 36)

    //6.Scala如果期望是无返回值类型，可以省略等号
    def f6(name: String) {
      println(name)
    }

    println(f6("Smoky6"))
    println("=" * 36)

    //7.如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
    def f7(): Unit = {
      println("Smoky7")
    }

    f7
    println(f7)
    f7()
    println(f7())
    println("=" * 36)

    //8.如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    def f8: Unit = {
      println("Smoky8")
    }

    f8
    println(f8)
    //    f8()
    //    println(f8())
    println("=" * 36)

    //9.如果不关心名称，只关心逻辑处理，那么函数名（def）可以省略
    def f9(name: String): Unit = {
      println(name)
    }
    //匿名函数，lambda表达式
    (name: String) => {
      println(name)
    }
      println("=" * 36)
  }
}
