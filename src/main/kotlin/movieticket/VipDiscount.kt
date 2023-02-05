package movieticket

// 具体策略类-Vip折扣
class VipDiscount : Discount {
    override fun calculate(price: Float): Float {
        return price * 0.7F
    }
}