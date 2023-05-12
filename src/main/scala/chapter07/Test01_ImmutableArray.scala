package chapter07

//不可变数组
//引用类型，对象的地址，和空间大小不可变，但不关心其值
object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    //1.创建数组
    val arr: Array[Int] = new Array[Int](5)

    //另一种创建方式
    val arr2 = Array(12, 34, 45, 65, 76)

    //2.访问元素
    println(arr(0))
    println(arr(1))
    println(arr(3))
    println(arr(4))

    arr(0) = 12
    arr(1) = 123
    arr(2) = 1234
    arr(3) = 124
    arr(4) = 125
    println("=" * 36)

    println(arr(0))
    println(arr(1))
    println(arr(3))
    println(arr(4))
    println("=" * 36)

    //3.数组的遍历
    //1)普通for循环
    for (i <- 0 until arr.length) {
      println(arr(i))
    }
    println("=" * 36)

    for (i <- arr.indices) println(arr(i))
    println("=" * 36)

    //2)直接遍历所有元素，增强for循环
    for (elem <- arr) println(elem)
    println("=" * 36)

    //3)迭代器
    val iter = arr.iterator
    while (iter.hasNext)
      println(iter.next())
    println("=" * 36)

    //4)调用和foreach方法
    arr.foreach((elem: Int) => println(elem))
    arr.foreach(println)

    println(arr.mkString("--"))
    println("=" * 36)
    //4.添加元素
    val newArr = arr.:+(77) //必须返回一个新的数组，尾加
    println(arr.mkString("--"))
    println(newArr.mkString("--"))

    val newArr2 = arr.+:(40)
    println(newArr2.mkString("--"))

    val newArr3 = arr :+ 18
    println(newArr3.mkString("--"))

    val newArr4 = 99 +: arr
    println(newArr4.mkString("--"))

  }

}
