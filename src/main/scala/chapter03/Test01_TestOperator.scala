package chapter03

object Test01_TestOperator {
  def main(args: Array[String]): Unit = {
    //算数运算符
    val result1: Int = 10 / 3
    println(result1)

    val result2: Double = 10 / 3
    println(result2)

    val result3: Double = 10.0 / 3
    println(result3)
    println(result3.formatted("%.2f"))

    //比较运算符
    val s1: String = "hello"
    val s2: String = new String("hello")
    println(s1 == s2) //scala和java的不同之处
    println(s1.equals(s2))
    println(s1.eq(s2)) //判断引用地址是否相等

    //逻辑运算符
    def m(n: Int): Int = {
      println("m被调用")
      return n
    }

    val n = 1
    println((4 > 5) && m(n) > 0) //短路效应，前面直接影响结果后面不执行

    //判断一个字符串是否为空
    def isNotEmpty(str: String): Boolean = {
      return str != null && !("".equals(str.trim))
    }

    println(isNotEmpty(null))

    //赋值运算符
    var b: Byte = 10
    var i: Int = 12
    i += 1
    println("i="+i)
  }


}
