package chapter06
//特征叠加,从后往前叠加
object Test14_TraitOverlying {
  def main(args: Array[String]): Unit = {

  }
}

//
trait Knowledge14{
  var amount:Int =0
  def increase():Unit={
    println("knowledge increased")
  }
}

trait Talent14{
  def singing():Unit
  def dancing():Unit
  def increase():Unit={
    println("talent increased")
  }
}
