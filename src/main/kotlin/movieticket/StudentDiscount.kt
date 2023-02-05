package movieticket

// 具体策略类-学生折扣
class StudentDiscount: Discount {
    override fun calculate(price: Float): Float {
        return price * 0.9F
    }
}