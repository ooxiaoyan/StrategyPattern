package universal

// 具体策略
class ConcreteStrategy1: Strategy {
    override fun doSomething() {
        println("具体策略ConcreteStrategy1 的运算法则")
    }
}