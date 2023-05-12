package chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

object Test18_Queue {
  def main(args: Array[String]): Unit = {
    //创建一个可变队列
    val queue: mutable.Queue[String] = new mutable.Queue[String]()
    queue.enqueue("q","s","v")
    println(queue)
    println(queue.dequeue())
    println(queue)
    queue.enqueue("d","e")
    println(queue)


    //不可变队列
    val queue2:Queue[String] = Queue("a","b","c")
    val queue3=queue2.enqueue("d")
    println(queue2)
    println(queue3)
  }
}
