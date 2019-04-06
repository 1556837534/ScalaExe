// 高阶函数示例
//1、map : 在某个列表上的每个元素执行一个计算，并且返回一个包含相同元素数目的一个新列表
var numbers = List(1,2,3,4,5,6,7,8,9,10)
numbers.map((i:Int) => i*2)
//简写方式
numbers.map(_ * 2)

//2、foreach  跟Map 很类似 只是没有返回值
numbers.foreach((i:Int) => i*1)
//简写方式
numbers.foreach(_ * 1)
println(numbers)

//3、filter 对元素 进行过滤操作 会移除使得函数返回false 的元素
numbers.filter((i:Int) => { i%2 == 0})
// 简写
numbers.filter(_ % 2==0)

//4、zip 合并 把两个列表中的元素 进行合并到一个列表中
// 合并 是将 两个列表中 下标一致的合在一起，若有列表中没有这个下标 就不进行合并
List("1","a").zip(List("T"))

//5、partition 根据条件(断言) 对列表进行拆分
// 能被2整除的在一个分区中 ，不能被2整除的在另外一个分区中
numbers.partition(_ % 2 ==0)

//6、find 返回集合中第一个匹配断言函数的元素
// 查找 3的倍数关系
numbers.find(_ % 3 == 0)

//7、flatten  可以把一个嵌套的结构进行展开 类似于 partition的逆操作
List(List(1,2,3),List(4,5,6)).flatten


//8、flatMap：压平操作
var myList = List(List(1,2,3),List(4,5,6))
myList.flatMap(x => x.map(_ *2))

// 执行过程
// 第一步 x => x.map(_ *2) 对每个分区进行操作 List(List(2,3,6),List(8,10,12))
// 第二步  flatMap(List(2,3,6),List(8,10,12)) 压平
//          List(2,4,6,8,10,12)


/*分析一下：WordCount单词拆分的过程
scala> sc.textFile("/root/temp/data.txt").flatMap(_.split(" ")).collect
res2: Array[String] = Array(I, love, Beijing, I, love, China, Beijing, is, the, capital, of, China)

数据：
I love Beijing
I love China
Beijing is the capital of China

第一步：_.split(" ")
结果：  I,love,Beijing
I,love,China
Beijing,is,the,capital,of,China

第二步：flatMap 压平
  结果：(I, love, Beijing, I, love, China, Beijing, is, the, capital, of, China)

*/
