// 柯里化 ：把一个具有多个参数的函数 转换为 一个函数链 链上每个节点都是单一的参数

//常规写法
def add(x:Int,y:Int) = x+y


// 还有一种写法 : 使用 柯里化
def addCurr(x:Int)(y:Int) = x+y


def multiByOne(x:Int,y:Int) = x*y

// 柯里化
def multiCurr(x:Int)(y:Int) = x*y