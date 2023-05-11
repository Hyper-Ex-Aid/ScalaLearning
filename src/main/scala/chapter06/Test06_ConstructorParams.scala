package chapter06

//构造器参数
object Test06_ConstructorParams {
  def main(args: Array[String]): Unit = {
    val student2 = new Student2()
    student2.name = "heihei"
    student2.age = 99
    println(s"student2: name = ${student2.name}, age = ${student2.age}")

    val student3 = new Student3("ob", 34)
    println(s"student3: name = ${student3.name}, age = ${student3.age}")

    val student4 = new Student4("aob", 74)
    //    println(s"student4: name = ${student4.name}, age = ${student4.age}")  //Error
    student4.printInfo()

    val student5 = new Student5("sssob", 34)
    println(s"student5: name = ${student5.name}, age = ${student5.age}")
    //    student5.age=99 //Error,用常量修饰，一经赋值则不能再更改


    val student6 = new Student6("ob", 34, "好好学习")
    println(s"student3: name = ${student6.name}, age = ${student6.age}")
    student6.printInfo()

  }
}

//定义类
//无参构造器,必须需要辅助构造器
class Student2 {
  //单独定义属性
  var name: String = _
  var age: Int = _
}

//上面定义等价为
class Student3(var name: String, var age: Int)

//主构造器无修饰
class Student4(name: String, age: Int) {
  def printInfo(): Unit = {
    println(s"student4: name = ${name}, age = ${age}")
  }
}


//常量修饰
class Student5(val name: String, val age: Int)

class Student6(var name: String, var age: Int) {
  var school: String = _

  def this(name: String, age: Int, school: String) {
    this(name, age)
    this.school = school
  }

  def printInfo(): Unit = {
    println(s"student6: name = ${name}, age = ${age}, school = ${school}")
  }


}