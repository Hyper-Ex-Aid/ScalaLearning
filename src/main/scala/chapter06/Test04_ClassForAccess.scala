package chapter06

//用于测试访问全新
object Test04_ClassForAccess {

}

//定义一个父类
class Person {
  private var idCard: String = "45345435"
  protected var name: String = "aill"
  var sex: String = "female"
  private[chapter06] var age: Int = 18//仅限在chapter06包里进行访问

  def printInfo()={
    println(s"Person: $idCard $name $sex $age")
  }
}
