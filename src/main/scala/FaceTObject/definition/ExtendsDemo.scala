package FaceTObject.definition

/**
  * @BelongsProject: ScalaExe
  * @BelongsPackage: FaceTObject.definition
  * @Author: Jackson_J
  * @CreateTime: 2019-03-25 22:10
  * @Description: Scala 中的继承 demo
  */
// 继承的第一个例子  Employee 员工类 继承 Person 类
class Person(val name:String,val age:Int) {
   def sayHello():String = "Hello "+name+" and the age is " +age
}

// 子类  如果要覆盖 父类中的同名参数 需要在前面加上 override  覆盖的参数 只能是常量 不能是变量
class Employee(override val name:String, override val age:Int, val salary:Int) extends Person (name,age){
  // 覆盖 父类中的sayHello 方法
  override def sayHello(): String = "Hello "+name+" and the age is " +age +" and the salary "+salary
}

object ExtendsDemo {
  def main(args: Array[String]): Unit = {
     // 创建 Person 对象
     var person = new Person("Jack",27)
     println(person.sayHello())

     // 创建一个 Employee 对象
     var person1:Person = new Employee("Mark",30,2000)
     println(person1.sayHello())

     // 创建一个Person类的匿名子类
     var person2:Person = new Person("Jerry",20) {
       //重写父类方法
       override def sayHello(): String = "匿名内部类中是sayHello 方法 name"+name+" age" +age
     }
     println(person2.sayHello())
  }
}
