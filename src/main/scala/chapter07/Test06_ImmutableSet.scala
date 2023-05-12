package chapter07

object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    //1.创建Set
    val set1 = Set(12, 43, 54, 65, 76, 87, 87)
    println(set1)
    println("="*36)

    //2.添加元素
    val set2 = set1 + 123
    println(set1)
    println(set2)
    println("="*36)

    //3.合并set
    val set3 = Set(343,54,65,67,543)
    val set4 = set2 ++ set3 //自动消除重复元素
    println(set4)
    println("="*36)

    //4.删除元素
    val set5 = set3 - 343
    println(set3)
    println(set5)
    println("="*36)

  }
}
