package chapter07

import scala.collection.mutable.ListBuffer

object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    //1.创建可变列表
    val list1: ListBuffer[Int] = new ListBuffer[Int]()
    val list2 = ListBuffer(12, 4345, 45, 65, 76)
    println(list1)
    println(list2)

    //2.添加元素
    list1.append(90)
    list1.prepend(888)
    list1.insert(1, 34343)
    list1.insert(1, 77, 989)
    println(list1)

    list1 += 25 += 11
    31 +=: 343 +=: list1
    println(list1)

    //3.合并list
    val list3 = list1 ++ list2
    println(list1)
    println(list2)
    println(list3)

    println("=" * 36)
    list1 ++= list2
    println(list1)
    println(list2)

    println("=" * 36)
    list1 ++=: list2
    println(list1)
    println(list2)

    //4.修改元素
    println("=" * 36)
    list2(3) = 999
    list2.update(0, 97)
    println(list2)

    //5.删除元素
    println("=" * 36)
    list2.remove(2)
    list2 -= 11
    println(list2)

  }
}
