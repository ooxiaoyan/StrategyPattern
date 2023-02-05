package movieticket

// 具体策略类-儿童折扣
class ChildrenDiscount : Discount {
    override fun calculate(price: Float): Float {
        return price - 10
    }
}