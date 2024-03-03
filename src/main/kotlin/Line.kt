// Milena Mrugała, zadanie nr 2

class Line(
    private var x1: Double,
    private var y1: Double,
    private var x2: Double,
    private var y2: Double
) {

    override fun toString(): String {
        return "Line(x1=$x1, y1=$y1, x2=$x2, y2=$y2)"
    }

    fun getX1(): Double {
        return x1
    }

    fun getY1(): Double {
        return y1
    }

    fun getX2(): Double {
        return x2
    }

    fun getY2(): Double {
        return y2
    }

    fun setX1(x1: Double) {
        this.x1 = x1
    }

    fun setY1(y1: Double) {
        this.y1 = y1
    }

    fun setX2(x2: Double) {
        this.x2 = x2
    }

    fun setY2(y2: Double) {
        this.y2 = y2
    }
}