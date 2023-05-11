package chapter02

object Test04_String {
  def main(args: Array[String]): Unit = {
    //字符串，通过+号连接
    val name: String = "alice"
    val age: Int = 18
    println(age + "岁的" + name + "在学校学习")


    //*用于将一个字符串复制多次并拼接
    println(name * 3)


    //printf用法：字符串，通过%传值
    printf("%d岁的%s在学校学习", age, name)
    println()

    //字符串模板（插值字符串）：通过$获取变量值
    println(s"${age}岁的${name}在学校学习")

    val num: Double = 2.3456
    println(f"The num is ${num}%2.2f")

    //raw原始处理
    println(raw"The num is ${num}%2.2f")


    //三引号表示字符串，保持多行字符串的原格式输出
    val sql = s"""
       |select*
       |from
       |  student
       |where
       |  name = ${name}
       |and
       |  age>${age}
       |""".stripMargin
    println(sql)
  }

}
