// 定义一个高阶函数  对数字10 进行某种运算
// f 代表一个函数 并且这个函数接收一个 Double 的数据类型 返回一个Double 的数据类型
def someAction(f:(Double)=> Double) = f(10)

// 测试
// 1 对10 进行开平方根
someAction(Math.sqrt)

// 2. 求 余弦
someAction(Math.cos)

// 例子 2

def simpleFun(x:Int,y:Int):Int = {x * y +100}

// 定义一个高阶函数
def myFuntion(f:(Int,Int) => Int,x:Int,y:Int) = f(x,y)


// 测试  simpleFun 是一个简单函数
myFuntion(simpleFun,10,20)






