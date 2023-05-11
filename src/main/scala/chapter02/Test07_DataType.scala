package chapter02

object Test07_DataType {

  def main(args: Array[String]): Unit = {
    //整数类型
    val a1: Byte = 127
    val a2: Byte = -128
    //val a2:Byte=128  Error

    val a3 = 12 //整数默认类型为Int
    val a4: Long = 12312312341413413L //长整型数值定义

    val b1: Byte = 10
    val b2: Byte = 10 + 20
    println(b2)

    val b3: Byte = (b1 + 20).toByte
    println(b3)


    //浮点类型
    val f1: Float = 1.234f
    val d1 = 2.3456 //浮点数类型默认为Double

    //字符类型
    val c1: Char = 'a'
    println(c1)

    val c2: Char = '9'
    println(c2)

    //特殊字符
    val c3: Char = '\t' //制表符
    val c4: Char = '\n' //换行符
    println("abc" + c3 + "def")
    println("abc" + c4 + "def")

    //转义字符
    val c5: Char = '\\' //表示\自身
    val c6: Char = '\"' //表示"自身
    println("abc" + c5 + "def")
    println("abc" + c6 + "def")

    //字符变量底层保存ASCII码
    val i1: Int = c1
    println("i1 " + i1)
    val i2: Int = c2
    println("i2 " + i2)

    val c7: Char = (i1 + 1).toChar
    println(c7)
    val c8: Char = (i2 - 1).toChar
    println(c8)

    //布尔类型
    val isTrue: Boolean = true
    println(isTrue)

    //空类型
    //空值Unit
    def m1(): Unit = {
      println("m1被调用执行")
    }

    val a = m1()
    print("a:" + a)

    //空引用null
    //    var n: Int = null //ERROR

    //Nothing
    def m2(n: Int): Int = {
      if (n == 0)
        throw new NullPointerException
      else
        return n
    }

    val b = m2(2)
    println("b:"+b)
  }

}
