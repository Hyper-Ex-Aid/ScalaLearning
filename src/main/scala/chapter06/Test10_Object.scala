package chapter06

object Test10_Object {
  def main(args: Array[String]): Unit = {
    //    val student=new Student10("alice",18)
    //    student.printInfo()

    val student = Student10.newStudent("alice", 18)
    student.printInfo()

    val student1 = Student10("bob",19)  //apply可以省略
    student1.printInfo()

  }

}

//定义类
class Student10 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student6: name = ${name}, age = ${age}, school = ${Student10.school}")
  }
}

//伴生对象
object Student10 {
  val school: String = "xuexiao"

  //定义一个类的对象实例的创建方法
  def newStudent(name: String, age: Int): Student10 = new Student10(name, age)

  def apply(name: String, age: Int): Student10 = new Student10(name, age)
}