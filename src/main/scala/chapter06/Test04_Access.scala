package chapter06

//访问权限
object Test04_Access {
  def main(args: Array[String]): Unit = {
    //创建对象
    val person: Person = new Person()
//    person.idCard //Error
//    person.name //Error,protected属性只能在当前类或子类进行访问
    println(person.age)
    println(person.sex)
    person.printInfo()

    val worker:Worker=new Worker()
//    worker=new Worker() //Error
//    worker.age=19 //right
    worker.printInfo()
  }

}

//定义一个子类
class Worker extends Person {
  override def printInfo(): Unit = {
    //    println(idCard) //error,私有的属性在子类里不能访问
    name = "bob"
    age = 25
    sex = "male"
    println(s"Worker: $name $sex $age")
  }
}

