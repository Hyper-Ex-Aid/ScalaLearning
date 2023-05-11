package chapter05

//惰性加载,在被调用时才加载
object Test12_Lazy {
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(12, 47)

    println("1.函数调用")
    println("2.result = "+result)
  }
  def sum(a:Int,b:Int)={
    println("3.sum调用")
    a+b
  }
}
