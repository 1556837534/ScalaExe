// scala worksheet 适合演示简单程序 相当于命令行
//演示for循环
//定义一个集合
val list = List("Mary","Tom","Mike")

//for循环的第一种写法:  <- 是scala中的generator 提取符 从后面的元素中提取
for (s <- list) println(s)

//for循环的第二种写法: 对提取的每个元素进行处理
for{
  s<- list
  //只打印名字长度大于 3
  if(s.length > 3)
}println(s)

//for循环的第三种写法: 打印名字长度小于3的名字
for(s<-list if s.length <= 3) println(s)

//介绍一下：关键字yield 作用：产生一个新的集合
//举例：把所有的名字都改成大写
val newList = for{
  s <- list
  s1 = s.toUpperCase
}yield(s1)



















