import scala.reflect.ClassTag
// 泛型函数

// 创建一个函数 生成一个Int 类型的数组
def makeIntArray(elem:Int*) = Array[Int](elem:_*)

makeIntArray(1,2,3,4)


// 创建一个通用的函数 类型是任意的
// ClassTag 表示运行时的一些信息 比如类型
def gengerFun[T:ClassTag](elem:T*) = Array[T](elem:_*)

gengerFun("1,2,","3")
gengerFun(2,3,4,5,6)


//隐式参数

def testParameter(name:String) = {println("The name is " + name)}

//调用
//testParameter("Tome")


//问题 调用的时候 能不能不传递参数
//1. 定义一个隐式参数的值
implicit var name:String = "Jack"

testParameter

