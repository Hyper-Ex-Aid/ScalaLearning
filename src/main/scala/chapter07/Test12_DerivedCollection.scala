package chapter07

object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 4, 5, 6, 7, 43, 3, 243)
    val list2 = List(34, 54, 6, 76, 87, 98, 454, 3)
    //(1)获取集合的头
    println(list1.head)
    println("=" * 36)
    //(2)获取集合的尾
    println(list1.tail)
    println("=" * 36)
    //(3)集合最后一个数据
    println(list2.last)
    println("=" * 36)
    //(4)集合初始数据
    println(list2.init)
    println("=" * 36)
    //(5)反转
    println(list1.reverse)
    println("=" * 36)
    //(6)取前（后）n个元素
    println(list1.take(3))
    println(list1.takeRight(3))
    println("=" * 36)
    //(7)去掉前（后）n个元素
    println(list1.drop(3))
    println(list1.dropRight(3))
    println("=" * 36)
    //(8)并集
    val union = list1.union(list2)
    println("union: " + union)
    println(list1 ::: list2) //
    println("=" * 36)
    //如果是set做并集，会去重
    val set1 = Set(1, 2, 4, 5, 6, 7, 43, 3, 243)
    val set2 = Set(34, 54, 6, 76, 87, 98, 454, 3)
    val union2 = set1.union(set2)
    println("union: " + union2)
    println(set1 ++ set2) //
    println("=" * 36)
    //(9)交集
    val intersection = list1.intersect(list2)
    println("intersection: " + intersection)
    println("=" * 36)
    //(10)差集
    val diff1 = list1.diff(list2)
    val diff2 = list2.diff(list1)
    println("diff1: " + diff1)
    println("diff2: " + diff2)
    println("=" * 36)
    //(11)拉链
    println("zip: " + list1.zip(list2))
    println("zip: " + list2.zip(list1))
    println("=" * 36)
    //(12)滑窗
    for(elem<-list1.sliding(3))
      println(elem)
    println("=" * 36)
    for(elem<-list1.sliding(4,2))
      println(elem)
    println("=" * 36)
  }
}
