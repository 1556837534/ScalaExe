//可变集合和不可变集合
import scala.collection.mutable
//定义一个不可变的集合
val math = scala.collection.immutable.Map("Alice"->80,"Tom"->75,"Mary"-> 90)

//可变集合
val chinese = scala.collection.mutable.Map("Alice"->80,"Tom"->75,"Mary"-> 90)

//基本操作
//取出集合中的值
chinese.get("Tom")
//如果key不存在，抛出Exception
chinese.get("Mike")

if(chinese.contains("Mary")){
  chinese("Mary")
}else{
  -1
}

//对集合进行修改：可变集合
chinese("Mary") = 99
chinese

//往集合中添加和移除元素
chinese += "Jerry" -> 88
chinese -= "Mary"


//列表：不可变列表（List）、可变列表（LinkedList）

//字符串列表
val nameList = List("Mary","Tom","Mike")
//整数列表
val intList = List(1,2,3,4,5,6)
//空列表
val nullList:List[Nothing] = List()

//二维列表
val dim:List[List[Int]] = List(List(1,2,3),List(5,6,7))

//不可变列表的操作
//输出列表中的值：head, tail,isEmpty
nameList.head

//tail:返回的不是最后一个元素，而是出去第一个元素后，剩下的所有元素
nameList.tail
println(nameList.isEmpty)

//可变列表（LinkedList）
val myList = mutable.LinkedList(1,2,3,4,5,6)
//把上面的可变列表中的每个元素乘以2

//定义一个指针指向列表的开头
var cur = myList

//Nil  表示Scala中的null
while(cur != Nil){
  //对当前的元素乘以2
  cur.elem = cur.elem  * 2

  //移动指针指向下一个元素
  cur = cur.next
}

//查看结果
println(myList)
















