package FaceTObject.definition

/**
  * @BelongsProject: ScalaExe
  * @BelongsPackage: FaceTObject.definition
  * @Author: Jackson_J
  * @CreateTime: 2019-03-25 22:37
  * @Description: （trait）: 就是本质就是抽象类，支持多重继承
  */
// 第一个 trait
trait Human {
   //定义字段 抽象字段
   val id:Int
   val name:String

   def sayHello():String = "Hello "+ name
}

//第二个 trait
trait Actions {
   //抽象方法
   def getActionsName():String
}

//子类
class student(val id:Int,val name:String) extends Human with Actions {
  override def sayHello(): String = " id " +id +" name " +name

  override def getActionsName(): String = " Action is Running "
}



object TraitClass {
  def main(args: Array[String]): Unit = {
      var studen = new student(1,"Tom")
      println(studen.sayHello())
      println(studen.getActionsName())
  }
}
