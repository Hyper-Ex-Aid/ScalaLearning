package chapter07

import scala.collection.mutable

object Test09_MutableMap {
  def main(args: Array[String]): Unit = {
    //1.创建map
    val map1: mutable.Map[String, Int] = mutable.Map("a" -> 13, "b" -> 25, "hello" -> 3)
    println(map1)
    println(map1.getClass)
    println("=" * 36)

    //2.添加元素
    map1.put("c", 5)
    map1.put("d", 9)
    println(map1)
    println("=" * 36)
    map1 += (("e", 7))
    println(map1)
    println("=" * 36)


    //3.删除元素
    println(map1("c"))
    map1.remove("c")
    println(map1.getOrElse("c", 0))

    map1 -= "d"
    println(map1)
    println("=" * 36)


    //4.修改元素
    map1.update("c", 5)
    map1.update("e", 9)
    println(map1)

    map1 += (("e", 7))
    println(map1)
    println("=" * 36)


    //5.合并两个map
    val map2: mutable.Map[String, Int] = mutable.Map("aaa" -> 11, "ccc" -> 29, "hello" -> 5)
    println(map1)
    map1 ++= map2
    println(map1)
    println(map2)
    println("=" * 36)

    val map3: mutable.Map[String, Int] = map2 ++ map1
    println(map1)
    println(map2)
    println(map3)

    println("=" * 36)


  }
}
