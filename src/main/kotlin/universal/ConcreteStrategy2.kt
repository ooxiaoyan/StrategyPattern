package universal

// 具体策略
class ConcreteStrategy2: Strategy {
    override fun doSomething() {
        println("具体策略ConcreteStrategy2 的运算法则")
    }
}