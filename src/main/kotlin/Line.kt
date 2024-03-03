// Milena Mrugała, zadanie nr 2

class Line(
    private var x1: Int,
    private var y1: Int,
    private var x2: Int,
    private var y2: Int
) {

    override fun toString(): String {
        return "Line(x1=$x1, y1=$y1, x2=$x2, y2=$y2)"
    }

    fun getX1(): Int {
        return x1
    }

    fun getY1(): Int {
        return 600 - y1
    }

    fun getX2(): Int {
        return x2
    }

    fun getY2(): Int {
        return 600 - y2
    }

    fun setX1(x1: Int) {
        this.x1 = x1
    }

    fun setY1(y1: Int) {
        this.y1 = y1
    }

    fun setX2(x2: Int) {
        this.x2 = x2
    }

    fun setY2(y2: Int) {
        this.y2 = y2
    }
}