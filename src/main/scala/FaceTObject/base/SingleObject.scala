package FaceTObject.base

/**
  * @BelongsProject: ScalaExe
  * @BelongsPackage: FaceTObject.base
  * @Author: Jackson_J
  * @CreateTime: 2019-03-25 21:55
  * @Description: Scala 中使用Object 来实现一个单例模式
  *               使用单例模式 生成信用卡卡号
  *               extends App 表示这个类中 不写Main 方法 直接执行这个程序
  */
object SingleObject extends App{
     // 定义一个变量 保存 信用卡卡号
     private[this] var creditCardNumber:Long = 0;

     // 定义 一个方法  来产生新的卡号
     def generateCreditCardNumber () :Long = {
       creditCardNumber += 1
       creditCardNumber
     }

     println(generateCreditCardNumber())
}
