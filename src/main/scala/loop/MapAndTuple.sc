// Map 数据类型  与 Tuple 数据类型 类型：不可变(immutable)、可变

//不可变 Map
var map = Map("Tome" -> 78,"Jackson" -> 99)

map

//可变Map
var changeMap = scala.collection.mutable.Map("Tome" -> 78,"Jackson" -> 99)
changeMap

//操作  使用 可变Map 来介绍
// 1. 获取映射中的值  如果key 不存在 会抛出一个 NoSuchFieldException
changeMap("Tome")
// 所以取值前先判断
if (changeMap.contains("Tom"))
   changeMap("Tome")
else
   -1

//简写  存在 Tome 取值Tome 的值 否则返回1
changeMap.getOrElse("Tome",-1)

// 改变映射中的值 前提 Map 是可变的
changeMap("Tome") = 85

// 迭代
for (s <- changeMap) println(s)

//---------Tuple  （不同数据类型的集合） 类似Json
var t1 = (1,2,"Tom")
// 定义一个元组 Tuple1 Tuple2
// new Tuple数字  数字表示的Tuple 必须要有多少个元素
var t2 = new Tuple2("Jack",2)

// 如何引用元组中的元素
t2._2

//迭代
// map 和foreach 的区别： 有没有返回值  map 有返回值
t2.productIterator.foreach(println)


