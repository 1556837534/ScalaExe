package FaceTObject.base

/**
  * @BelongsProject: ScalaExe
  * @BelongsPackage: FaceTObject.base
  * @Author: Jackson_J
  * @CreateTime: 2019-03-25 21:20
  * @Description: Scala 中类的定义
  */
class ClassDefin {
  //Scala 中定义变量的时候需要进行初始化 不然报错
   private var stuName:String = "Tome";
   //当一个属性被定义为private，就会自动为其生成对应get和set方法
   private var stuAge:Int = 20;
  //如果只希望有get方法，没有set方法，可以定义为常量
   private val constVariable:String = "const"

   //private[this]: 这个时候，就不会生成对应的get和set
   private[this] var local:String = "local"

  //方法
  def getStuName():String = stuName

  def setStuName(name:String) = this.stuName = name

  def setStuAge(age:Int) = this.stuAge =age

  def getStuAge():Int = stuAge

}


// 创建一个对象 main方法 需要写到 Scala 的伴生对象 类似Java 中的静态快

object ClassDefin{
   def main(args:Array[String]):Unit = {
        //创建一个 对象
        var obj = new ClassDefin

        println(obj.getStuName()+"---"+obj.getStuAge())

        // 直接调用 类的私有成员
        println(obj.stuName+"--"+obj.stuAge)
   }

}

