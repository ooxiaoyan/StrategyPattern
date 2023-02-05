import universal.ConcreteStrategy1
import universal.Context
import universal.Strategy

fun main(args: Array<String>) {
    // 声明一个具体的策略
    val strategy: Strategy = ConcreteStrategy1()
    // 声明上下文对象
    val context = Context(strategy)
    //执行封装后的方法
    context.doAnything()
}