package chapter07

object Test15_HighLevelFunction_Reduce {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)

    //1.reduce
    println(list.reduce(_ + _)) //默认从左往右
    println(list.reduceLeft(_ + _))
    println(list.reduceRight(_ + _)) //从右往左
    println("=" * 36)
    println(list.reduce(_ - _))
    println(list.reduceLeft(_ - _))
    println(list.reduceRight(_ - _))
    println("=" * 36)

    //2.fold
    println(list.fold(10)(_ + _)) //10+1+2+3+4
    println(list.foldLeft(10)(_ - _)) //10-1-2-3-4
    println(list.foldRight(11)(_ - _))  //1-(2-(3-(4-11)))
    println("=" * 36)
  }

}
