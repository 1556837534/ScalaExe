package FaceTObject.base

/**
  * @BelongsProject: ScalaExe
  * @BelongsPackage: FaceTObject.base
  * @Author: Jackson_J
  * @CreateTime: 2019-03-25 22:04
  * @Description:
  *               apply方法：如果一个类有了对应的apply方法，在创建类的对象的时候，可以省略new关键字
  *               apply 需要放在伴生对象中
  */
class TestApply(var stuName:String) {


}

object TestApply {
   // 定义一个apply 方法  用来省略 new 关键词
   def apply(stuName: String) = {
      println("--调用了吗---")
      new TestApply(stuName)
   }

   // 测试
   def main(args: Array[String]): Unit = {
     var s = TestApply("Tom")
   }
}
