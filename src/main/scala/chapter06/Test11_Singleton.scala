package chapter06

//单例设计模式
object Test11_Singleton {
  def main(args: Array[String]): Unit = {
    val student1 = Student11.getInstance()
    student1.printInfo()

    val student2 = Student11.getInstance()
    student2.printInfo()
  }
}


//定义类
class Student11 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student6: name = ${name}, age = ${age}, school = ${Student10.school}")
  }
}

//饿汉式
//object Student11 {
//  private val student: Student11 = new Student11("alice", 18)
//
//  def getInstance(): Student11 = student
//}

//懒汉式
object Student11 {
  private var student: Student11 = _

  def getInstance(): Student11 = {
    if (student == null) {
      //如果没有对象实例，就创建一个
      student = new Student11("alice", 18)
    }
    student
  }
}