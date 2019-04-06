package HigFun

/**
  * @BelongsProject: ScalaExe
  * @BelongsPackage: HigFun
  * @Author: Jackson_J
  * @CreateTime: 2019-03-31 21:11
  * @Description: 隐式转换函数  能否把 Fruit 转换为 Monkey 对象
  */

// 水果类
class FruitFun(name:String) {
   def getName():String = name
}

// 类 猴子
class Monkey(f:FruitFun) {
   def say()={println("Monkey like " + f.getName())}
}



object  ImplicitFun {
  // 定义一个隐式转换规则  Fruit=>Monkey
  implicit def FruitToMonkey(f:FruitFun):Monkey = {new Monkey(f)}

  def main(args: Array[String]): Unit = {
     // 创建水果对象
     var f:FruitFun = new FruitFun("香蕉");

     FruitToMonkey(f).say()
    // 能否 将 Fruit 对象转为 monkey 对象
  }
}