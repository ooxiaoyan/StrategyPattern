package movieticket

// 抽象策略类-折扣
interface Discount {
    fun calculate(price: Float): Float
}