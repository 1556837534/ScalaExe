package FaceTObject.definition

/**
  * @BelongsProject: ScalaExe
  * @BelongsPackage: FaceTObject.definition
  * @Author: Jackson_J
  * @CreateTime: 2019-03-25 22:27
  * @Description: Scla 中的抽象类
  */


// 抽象父类
abstract class Vehicle {
   // 定义一个抽象方法
   def checkType():String
  // 抽象字段: 没有初始值的字段
   var id:Int
}

// 子类
class Car extends Vehicle {
  override var id: Int = 2
  override def checkType(): String = {"I am a car"}
}

// 如果在子类中 没有提供父类对应抽象字段的初始值，该之类也必须是抽象的
class Bike extends Vehicle {
  override var id: Int = 3
  override def checkType(): String = "I am a Bike"
}

// 如果子类继承父类中的抽象字段,但是不想声明为抽象类 ，则可以在子类中的主构造器中 声明该父类的抽象字段
class Bike2(var id:Int) extends Vehicle {
  override def checkType(): String = "Hi"
}


object AbstractClass {
  def main(args: Array[String]): Unit = {
      var v1:Vehicle = new Car
      var v2:Vehicle = new Bike

      println(v1.checkType())
      println(v2.checkType())
  }
}
