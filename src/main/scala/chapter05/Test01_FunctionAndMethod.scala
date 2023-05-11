package chapter05

object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {
    //定义函数
    def sayHi(name: String): Unit = {
      println("hi, " + name)
    }

    //调用函数
    sayHi("Smoky")

    //调用对象的方法
    Test01_FunctionAndMethod.sayHi("Smokk")
  }
  //定义对象的方法
  def sayHi(name: String): Unit = {
    println("hi, " + name)
  }
}
