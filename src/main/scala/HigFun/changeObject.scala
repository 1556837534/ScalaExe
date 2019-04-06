package HigFun

/**
  * @BelongsProject: ScalaExe
  * @BelongsPackage: HigFun
  * @Author: Jackson_J
  * @CreateTime: 2019-03-28 22:16
  * @Description: Scale 中的协变与逆变
  */
//协变：泛型变量的值可以是本身类型或者子类的类型
package demo1{
  //父类
  class Animal

  //子类
  class Bird extends Animal

  // 类 吃东西
  class EatSomething[+T](t:T)


  object changeObject {
    def main(args: Array[String]): Unit = {
        // 创建 鸟吃东西
      var c1:EatSomething[Bird] = new EatSomething[Bird](new Bird)

      // 动物吃东西 正确
      //var c2:EatSomething[Animal] = new EatSomething[Animal](new Animal)

      // 问题 能否 将 c1 赋值给 c2 报错
      // 尽管Bird 是Animal的子类，但是 EatSomething[Bird] 不是EatSomething[Animal] 的子类
      //var c2:EatSomething[Animal] = c1
      // 解决方法  使用协变
      // 在 EatSomething 中的泛型前 加个 +
    }

  }
}


//逆变：泛型变量的值可以是本身类型或者父类的类型
package demo2{
  //父类
  class Animal

  //子类
  class Bird extends Animal

  // 鸟的子类
  class Sparrow extends Bird

  // 类 吃东西
  class EatSomething[-T](t:T)


  object changeObject {
    def main(args: Array[String]): Unit = {
      // 创建 鸟吃东西
      var c1:EatSomething[Bird] = new EatSomething[Bird](new Bird)

      // 创建麻雀吃东西  正确
      var c2:EatSomething[Sparrow] = new EatSomething[Sparrow](new Sparrow)

      // 问题 能否 将 c1 赋值给 c2 报错
      // 尽管Sparrow 是Bird的子类，但是 EatSomething[Sparrow] 不是EatSomething[Bird] 的子类
      //var c2:EatSomething[Sparrow] = c1
      // 解决方法  使用逆变
      // 在 EatSomething 中的泛型前 加个 -
    }

  }
}