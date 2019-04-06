package FaceTObject.base

import scala.collection.mutable.ArrayBuffer

/**
  * @BelongsProject: ScalaExe
  * @BelongsPackage: FaceTObject.base
  * @Author: Jackson_J
  * @CreateTime: 2019-03-25 21:35
  * @Description: Scala 内部类
  */
class InnerClass {

    private var stuName:String = "Jackson"

    private var stuAge:Int = 26

    // 定义一个内部类 学生选修的课程 课程名 与学分
    // 定义一个构造器 (分为 主构造器:跟类的申明在一起)
    class innerClass(val cname:String,val credit:Int) {
       //其他方法

    }

    // 定义一个数组 来保存 学生选修的所有课程
    private var courseList = new ArrayBuffer[innerClass]()

    //定义方法
    def addNewCourse(cname:String,credit:Int): Unit = {
       var c = new innerClass(cname,credit)
       //加入List  相当 append
       courseList += c
    }
}

// 在伴生对象中创建main方法
object InnerClass {
  def main(args: Array[String]): Unit = {
     //创建学生对象
     var s = new InnerClass

     // 添加课程
     s.addNewCourse("数学",100)
     s.addNewCourse("语文",70)
     s.addNewCourse("物理",80)

     // 输出
    println(s.stuName+"--"+s.stuAge)
    for (s <- s.courseList)println(s.cname+"--"+s.credit)
  }
}