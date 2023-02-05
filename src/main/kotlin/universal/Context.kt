package universal

// 封装角色
// 构造函数设置具体策略
class Context(private val strategy: Strategy) {

    // 封装后的策略方法
    fun doAnything() {
        strategy.doSomething()
    }
}