// 使用while 循环
val list = List("Mary","Tom","Mark")

// 变量
var i = 0
while(i < list.length) {
  println(list(i))
  i += 1
}

// do while 循环
var j =0
do {
  println(list(j))
  //自增
  j+=1

} while(j<list.length)

// 使用 forEach 进行迭代 参数是一个函数参数 函数参数接收的字符串
// 参考笔记中的图
// 这个例子中 foreach 函数接收了另一个函数(println) 作为值
list.foreach(println)

//  函数的参数
// 1. call by value : 对函数的实参求值，仅求一次
// 执行步骤
// 1 test1(7,8)  2: 7+7  3 : 14

def test1(x:Int,y:Int):Int = x+x
test1(3+4,8)

//2. call by name  : 函数的实参在函数体内部，每次调用的时候都会求值
// 1: (3+4) + (3+4)  2: 7 + (3+4) 3: 7+7 4 :14
def test2(x: => Int,y: => Int):Int = x+x
test2(3+4,8)

// 一个复杂一点的例子: x是call by value, y是call by name
def test3(x:Int,y: => Int):Int = 1

// 一个死循环
def loop():Int = loop

// 以下输出是?
// 1  call by Name  实际调用的时候才会去求值 这里没有调用 2个参数 就不会去循环
//test3(1,loop)
// 死循环 这种情况下 loop是 call by Value 会去执行 loop 就是死循环
//test3(loop,1)

//默认参数
def fun(name:String = "Jack"):String = "Hello"+name
fun()
fun("Tom")

// 可变参数
def sum(args:Int*) :Int = {
    var result =0;
    for (s <- args)
       result += s
    result
}

sum(1,2,3,4,5)


