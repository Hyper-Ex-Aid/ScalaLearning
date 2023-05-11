package chapter06

//构造器
object Test05_Constructor {
  def main(args: Array[String]): Unit = {
    val student1:Student1=new Student1()
    student1.Student1()

    val student2:Student1=new Student1("obo")
    val student3:Student1=new Student1("obo",445)
  }
}

//定义一个类
//无参数，（）可以省略
class Student1() {
  //定义属性
  var name: String = _
  var age: Int = _
  println("1. 主构造方法被调用")

  //声明辅助构造方法
  def this(name: String) {
    this() //直接调用主构造器
    println("2. 辅助构造方法一被调用")
    this.name = name
    println(s"name: $name, age: $age")
  }

  def this(name: String, age: Int) {
    this(name) //间接调用主构造器
    println("3. 辅助构造方法二被调用")
    this.age = age
    println(s"name: $name, age: $age")
  }

  def Student1():Unit={
    println("普通方法被调用，而不是构造方法")
  }

}