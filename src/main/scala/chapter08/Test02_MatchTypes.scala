package chapter08

object Test02_MatchTypes {
  def main(args: Array[String]): Unit = {
    //1.匹配常量
    def describeConst(x:Any):String=x match {
      case 1 => "Int one"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "Char +"
      case _ => "other"
    }

    println(describeConst("hello"))
    println(describeConst("+"))
    println(describeConst(0))

    //2.匹配类型
    def describeType(x:Any):String=x match {
      case i:Int => "Int" + i
      case s:String => "String" +s
      case list:List[String] => "List" +list
      case array: Array[Int] => "Array[Int]" + array.mkString(",")
      case a => "something else" + a
    }

    println(describeType(5))
    println(describeType("hello"))
    println(describeType(List("hi","hello")))
    println(describeType(List(2,34,4)))
    println(describeType(Array("hi","int")))
    println(describeType(Array(23,45,65,5)))
  }
}
