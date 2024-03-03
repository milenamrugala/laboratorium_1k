// Milena Mrugała, zadanie nr 1

class Point(
    private var x: Double,
    private var y: Double
) {

    override fun toString(): String {
        return "Point(x=$x, y=$y)"
    }

    fun move(dx: Double, dy: Double) {
        x += dx
        y += dy
    }

    fun getX(): Double {
        return x
    }

    fun getY(): Double {
        return y
    }

    fun setX(x: Double) {
        this.x = x
    }

    fun setY(y: Double) {
        this.y = y
    }
}


