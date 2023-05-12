package chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    //1.创建可变数组
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(23, 34, 545, 65)
    println(arr1.mkString(","))
    println(arr2)

    //2.访问元素
    println(arr2(0))

    //3.添加元素
    val newArr1 = arr1 :+ 15
    println(newArr1)

    arr1 += 19
    println(arr1)
    arr1.append(36)
    arr1.prepend(45)
    arr1.insert(2, 6778)
    println(arr1)
    arr1.prependAll(newArr1)
    println(arr1)

    //4.删除元素
    arr1.remove(2)
    println(arr1)

    //5.可变数组转换为不可变数组
    val arr: ArrayBuffer[Int] = ArrayBuffer(12, 343, 545, 65)
    val newArr: Array[Int] = arr.toArray
    println(newArr.mkString(","))
    println(arr)

    //6.不可变数组转换为可变数组
    val buffer:mutable.Buffer[Int] = newArr.toBuffer
    println(buffer)
    println(newArr)

    //
  }
}
