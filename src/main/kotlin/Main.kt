import movieticket.Discount
import movieticket.MovieTicket
import movieticket.VipDiscount
import universal.ConcreteStrategy1
import universal.Context
import universal.Strategy

fun main(args: Array<String>) {

    // ----------------------------- movie ticket -----------------------------
    val discount: Discount = VipDiscount()
    val movieTicket = MovieTicket(discount)
    movieTicket.originalPrice = 60F
    val currentPrice = movieTicket.getPrice()
    println("票价为：$currentPrice，折扣类型：${discount.javaClass.simpleName}")

    // ----------------------------- universal -----------------------------
    // 声明一个具体的策略
    val strategy: Strategy = ConcreteStrategy1()
    // 声明上下文对象
    val context = Context(strategy)
    //执行封装后的方法
    context.doAnything()
}