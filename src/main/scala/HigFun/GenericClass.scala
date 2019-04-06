package HigFun

/**
  * @BelongsProject: ScalaExe
  * @BelongsPackage: HigFun
  * @Author: Jackson_J
  * @CreateTime: 2019-03-28 21:29
  * @Description: 泛型类
  */
class GenericClass[T] {
  //定义变量 : 代表任意数据类型 初始化 _
  private var content:T = _

  def set(value:T) = content = value

  def get():T = content

}

object  GenericClass {
  def main(args: Array[String]): Unit = {
     // 整数
     var v = new GenericClass[Int]
     v.set(100)
     println(v.get())
  }
}



// 定义父类 : 所有的交通工具
class Vehicle{
   // 驾驶
   def drive() = println("Driving")
}

//定义两个子类
class Car extends Vehicle {
  override def drive(): Unit = println("开车")
}

class Bicycle extends Vehicle {
  override def drive(): Unit = println("骑自行车")
}

object testObj {
   // 定义一个测试方法 : 泛型函数  T 的取值 只能是 Vehicle及其子类
   // T <:Vehicle T 只能是 Vehicle及其子类
   def takeVehicle[T <:Vehicle](v:T) = v.drive()

  def main(args: Array[String]): Unit = {
    // 定义一个交通工具
    var v1:Vehicle = new Vehicle
    takeVehicle(v1)
  }
}

