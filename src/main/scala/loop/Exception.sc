import scala.collection.mutable.ArrayBuffer
// 如何处理异常
try {
  // 读取一个不存在的文件
  var file = scala.io.Source.fromFile("G:\\1\\1\\2.txt")
} catch {
  case ex1 : java.io.FileNotFoundException => {
    println("File Not Fount")
  }
  case _:Exception => {
     println("Other Exception")
  }
} finally {
   println("一定执行")
}


// 1. 定长数组
var a = Array[Int](10)   // Array 有一个 apply方法 接收Int 类型方法
// 要省略 new 关键词 需要 定义对应的 apply 方法
var b = new Array[String](2)  //// Array 有一个 apply方法 没有String 类型方法

var c = Array("Tom")

// 变长数组
  // 提供了对应的Int 的apply方法 可以省略 new
var d = new ArrayBuffer[Int]()

// 往变长数组中添加元素
d +=1
d +=2
//一次添加多个元素
d += (10,20,30)

// 变长数组的基本操作
d.trimEnd(2)  //去掉尾部的2个元素

d

// 把一个 ArrayBuffer 转为一个Array
d.toArray

// 遍历数组 for  foreach
d.foreach(println)

// ---------------Scala 中数组的常用操作

// 最大值
d.max
//最小值
d.min
//求和
d.sum
//排序 写法1
d.sortWith(_ > _)
// 写法2
d.sortWith((a,b) => {
   if (a >b)
      true
   else
     false
})

// 创建一个多维数组
//1. 创建一个二维数组 数组中的每个元素都有固定长度 3行 2列
var twoArray = Array.ofDim[Int](3,2);

// 赋值 第一行 2列值为 10
twoArray(1)(2) = 10

// 2. 创建一个二维数组 里面每个元素都是一个数组 ，长度不一样
// 第一个 一维数组  1元素  第二个一维数组 2元素 ...
var subArray = new Array[Array[Int]](10);

//赋值
for (k <- 0 until subArray.length)
  subArray(k) = new Array[Int](k)





