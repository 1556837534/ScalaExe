// 序列 Vector Range

// Vector  ：是一个带有下标的序列
var v = Vector(1,2,3,4,5)

// 查找 返回第一个大于2 的元素
v.find(_>2)
// 更新 第二个元素
v.updated(1,100)

// Range ： 表示整数序列
println("第一种写法: 0-5" + Range(0,5))
println("第二种写法: 0-5" + (0 until 5))
println("第二种写法: 0-5" + (0 to 5))

// 把 Range 转为List
1 to 4 toList

// set : 不重复元素集合
var s = Set(1,2,3)

// 添加元素 重复元素 添加不进去
s+3
