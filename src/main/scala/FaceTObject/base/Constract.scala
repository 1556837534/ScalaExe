package FaceTObject.base

/**
  * @BelongsProject: ScalaExe
  * @BelongsPackage: FaceTObject.base
  * @Author: Jackson_J
  * @CreateTime: 2019-03-25 21:48
  * @Description: Scala 辅助构造器
  */
// 主构造器
class Constract(var stuName:String,var stuAge:Int) {
    // 辅助构造器 this 关键词
    def this(age:Int) {
       //可以调用主构造器 生成对象
       this("no name",age)
    }
}

object Constract {
  def main(args: Array[String]): Unit = {
      // 创建学生对象 辅助构造器
      var s = new Constract(20)

  }
}
