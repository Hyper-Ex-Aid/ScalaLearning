package chapter07

object Test11_CommonOp {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 5, 7, 9, 6)
    val set = Set(23, 4, 5, 65, 76)
    //(1)获取集合长度
    println(list.length)
    println(list.size)
    println("=" * 36)
    //(2)获取集合大小
    println(set.size)
    println("=" * 36)
    //(3)循环遍历
    for (elem <- list) {
      println(elem)
    }
    println("=" * 36)
    set.foreach(println)
    println("=" * 36)
    //(4)迭代器
    for (elem <- list.iterator) println(elem)
    println("=" * 36)
    //(5)生成字符串
    println(list)
    println(set)
    println(list.mkString(","))
    println("=" * 36)
    //(6)是否包含
    println(list.contains(23))
    println(set.contains(23))
    println("=" * 36)
  }

}
