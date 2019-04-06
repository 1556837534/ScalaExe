package HigFun

/**
  * @BelongsProject: ScalaExe
  * @BelongsPackage: HigFun
  * @Author: Jackson_J
  * @CreateTime: 2019-03-31 21:28
  * @Description: 隐式类  增强类的功能
  */


object ImplicitClass {
    //定义一个类
  implicit  class Calc(x:Int) {
      //定义一个方法
      def add(y:Int):Int = x+y
    }

  def main(args: Array[String]): Unit = {
     //完成一件事 -----计算 1+2
     println("求和--" + 1.add(2))

  }
}
