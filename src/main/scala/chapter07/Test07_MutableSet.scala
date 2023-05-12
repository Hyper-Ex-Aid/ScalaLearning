package chapter07

import scala.collection.mutable

object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    //1.创建set
    val set1: mutable.Set[Int] = mutable.Set(2, 43, 54, 65, 76, 77, 87, 8, 69)
    println(set1)
    println("=" * 36)

    //2.添加元素
    val set2 = set1 + 33
    println(set1)
    println(set2)

    set1 += 11
    println(set1)
    println("=" * 36)
    val flag1 = set1.add(10)
    println(flag1)
    println(set1)
    val flag2 = set1.add(10)
    println(flag2)
    println(set1)
    println("=" * 36)

    //3.删除元素
    set1 -= 11
    println(set1)
    val flag3 = set1.remove(10)
    println(flag3)
    println(set1)
    val flag4 = set1.remove(10)
    println(flag4)
    println(set1)
    println("=" * 36)

    //4.合并两个set
    val set3 = mutable.Set(23, 34, 45, 5, 6, 7, 3, 2, 32, 344)
    println(set1)
    println(set3)
    println("=" * 36)
    val set4 = set1 ++ set3
    println(set1)
    println(set3)
    println(set4)
    println("=" * 36)
    set1 ++= set3
    println(set1)
    println(set3)

  }
}
