//模式匹配: Java中switch语句
//1、基本用法
var sign =0
var ch1='_'
ch1 match {
  case '+' => sign =1
  case '-' => sign = -1
  case '_' => sign = 0 //其他值 用下划线
}

//2、守卫：在模式匹配中使用if语句
var ch2 = '6'
var digit:Int= -1
// 匹配所有的数字(通过守卫可以匹配某种类型的所有值)
ch2 match {
  case '+' => sign =1
  case '-' => sign = -1
  case _ if Character.isDigit(ch2) => digit=Character.digit(ch2,10)
}

//3、模式匹配的变量
var v3 ="Hello world"
v3(7) match {
  case '+' => sign =1
  case '-' => sign = -1
  case ch => println("这个字符是："+ ch) // ch变量代表值
}
//4、类型模式匹配
var v4:Any = 100 // Any 表示任意类型  相当于Java 的Object
v4 match {
  case x:Int => println("这是一个整数")
  case x:String => println("这是一个字符串")
  case _ => println("其他类型")
}

//5、匹配数组和列表
var v5=Array(1,2,3) //数组
v5 match {
  case Array(0) => println("这是第一种情况")
  case Array(x,y) => println("数组中有两个元素"+(x+y))
  case Array(x,_*) => println("其他情况")
}


var v6 = List(1,2,3) // 与数组匹配一样的写法
