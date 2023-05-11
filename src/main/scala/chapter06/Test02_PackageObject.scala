//package chapter06
//
//object Test02_PackageObject {
//  def main(args: Array[String]): Unit = {
//    commonMethod()
//    println(commonValue)
//  }
//}

package chapter06 {
  object Test02_PackageObject {
    def main(args: Array[String]): Unit = {
      commonMethod()
      println(commonValue)
    }
  }
}

package ccc {
  package ddd {
    object Test02_PackageObject{
      def main(args: Array[String]): Unit = {
        println(school)
      }
    }

  }
  //定义一个包对象,在同一层级时才可以访问
  package object ddd {
    val school: String = "学校"
  }
}

////定义一个包对象
//package object ddd {
//  val school: String = "学校"
//}