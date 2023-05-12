package chapter07

object Test04_List {
  def main(args: Array[String]): Unit = {
    //1.创建一个List
    val list1 = List(23, 34, 65)
    println(list1)

    //2.访问和遍历元素
    println(list1(1))
    list1.foreach(println)

    //3.添加元素
    val list2 = 10 +: list1
    val list3 = list1 :+ 23
    println(list2)
    println(list3)

    val list4 = list1.::(333)
    println(list4)
    val list5 = Nil.::(13)
    println(list5)
    val list6 = 32 :: Nil
    println(list6)

    val list7 = 14 :: 34 :: 44 :: Nil
    println(list7)

    val list8 = list6 :: list7
    println(list8)

    val list9 = list6 ::: list7
    println(list9)

    val list10 = list8 ++ list9
    println(list10)
  }

}
