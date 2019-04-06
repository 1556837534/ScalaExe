// 样本类 case class
class Fruit
//为了更好的支持模式匹配 关键词 case
case class Apple(name:String) extends Fruit

case class Banana(name:String) extends Fruit

// 创建几个对象
var apple = new Apple("苹果")
var banana = new Banana("香蕉")

apple match {
  case Apple(name) => println("这是一个苹果")
  case Banana(name) => println("这是一根香蕉")
  case _ => println("其他")
}
