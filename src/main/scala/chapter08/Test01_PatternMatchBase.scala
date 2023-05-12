package chapter08

//模式匹配
object Test01_PatternMatchBase {
  def main(args: Array[String]): Unit = {
    //1.基本定义语法
    val x: Int = 3
    val y: String = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "other"
    }
    println(y)

    //2.模式守卫
    //求一个整数的绝对值
    def abs(num: Int): Int = {
      num match {
        case i if i >= 0 => i
        case i if i <= 0 => -i
      }
    }

    println(abs(67))
    println(abs(-99))
  }
}
