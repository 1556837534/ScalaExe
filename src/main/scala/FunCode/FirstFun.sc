// Scala 函数式编程

// 定义函数
def myfun(name:String):String = "Hello "+name

println(myfun("Tome"))

def myfun1():String = "Hello world"

println(myfun1())

// 值函数  将函数作为变量的值

val v1 = myfun("tom")
val v2 = myfun1()

// 在将 v1 的值 赋值 给 myfun1

println(myfun(v2))

//匿名函数
(x:Int) => x*3

//调用匿名函数
// 由于 map 接收一个函数的参数
Array(1,2,3).map((x:Int) =>x *3)