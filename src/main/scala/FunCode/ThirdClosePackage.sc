// 闭包  对某个数字 进行 乘法运算 倍数未定

def mulBy(factor:Double) = (x:Double) => factor * x

//第一个参数 factor 代表乘以几倍
// 第二个参数 (x:Double) 是匿名函数 接收一个Double 参数 并且可以访问外部函数

// 测试 3倍
var count = mulBy(3)


// 除以2
var va = mulBy(0.5)

// 调用
println(count(10) +"-------"+va(10))
