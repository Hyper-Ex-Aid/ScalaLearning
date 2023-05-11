package chapter05

/*
闭包：如果一个函数，访问到了它的外部（局部）变量的值，那么这个函数和他所处的环境称为闭包
函数柯里化：把一个参数列表的多个参数，变成多个参数列表
 */
object Test08_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }

    //1.考虑固定一个加数场景
    def addByFour(b: Int): Int = {
      4 + b
    }

    //2.扩展固定加数改变的情况
    def addByFive(b: Int): Int = {
      5 + b
    }

    //3.将固定加数作为另一个参数传入，但是是作为“第一层参数”传入
    def addByFour1(): Int => Int = {
      val a = 4

      def addB(b: Int): Int = {
        a + b
      }

      addB
    }

    def addByA(a: Int): Int => Int = {
      def addB(b: Int): Int = {
        a + b
      }

      addB
    }

    println(addByA(35)(24))

    val addByFour2 = addByA(4)
    val addByFive2 = addByA(5)

    println(addByFour2(13))
    println(addByFive2(21))

    //4.lambda表达式简写
    def addByA1(a: Int): Int => Int = {
      b => a + b
    }

    println("=" * 36)
    val addByFour3 = addByA1(4)
    val addByFive3 = addByA1(5)

    println(addByFour3(13))
    println(addByFive3(21))

    def addByA2(a: Int): Int => Int = a + _

    println("=" * 36)
    val addByFour4 = addByA2(4)
    val addByFive4 = addByA2(5)

    println(addByFour4(13))
    println(addByFive4(21))

    //5.柯里化
    def addCurrying(a: Int)(b: Int): Int = {
      a + b
    }
    println("=" * 36)
    println(addCurrying(35)(24))

  }
}
