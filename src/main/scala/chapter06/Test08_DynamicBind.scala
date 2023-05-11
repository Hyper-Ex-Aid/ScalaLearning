package chapter06

object Test08_DynamicBind {
  def main(args: Array[String]): Unit = {
    val student8:Person8=new Person8
    println(student8.name)
    student8.hello()
  }

}

class Person8 {
  val name: String = "bob"
  def hello():Unit={
    println("hello person")
  }
}

class Student8 extends Person8 {
  override val name: String = "bob"
  override def hello():Unit={
    println("hello student")
  }
}