package object chapter06 {
  //包对象
  //定义当前包共享的属性和方法
  val commonValue = "网上"

  def commonMethod(): Unit = {
    println(s"我在${commonValue}学习")
  }
}
