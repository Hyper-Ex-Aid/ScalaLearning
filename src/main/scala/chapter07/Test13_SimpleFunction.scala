package chapter07

object Test13_SimpleFunction {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 4, 5, 6, 7, 43, 3, 243)
    //(1)求和
    println(list.sum)
    //(2)求乘积
    println(list.product)
    //(3)最大值
    println(list.max)
    //(4)最小值
    println(list.min)
    //(5)排序
    println(list.sorted)
    println(list.sorted.reverse)
  }
}
