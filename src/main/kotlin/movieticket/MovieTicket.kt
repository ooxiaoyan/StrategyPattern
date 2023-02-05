package movieticket

// 封装类
class MovieTicket(private val discount: Discount) {

    var originalPrice: Float = 0F

    // 封装后的策略方法
    fun getPrice(): Float {
        return discount.calculate(originalPrice)
    }
}