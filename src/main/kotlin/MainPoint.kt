// Milena Mrugała, zadanie nr 1

fun main() {

    val firstPoint = Point(Math.random(), Math.random())
    val secondPoint = Point(Math.random(), Math.random())
    val thirdPoint = Point(Math.random(), Math.random())

    println("Współrzędne: $firstPoint")
    println("Współrzędne: $secondPoint")
    println("Współrzędne: $thirdPoint")

    val dx = Math.random()
    val dy = Math.random()

    firstPoint.move(dx, dy)
    secondPoint.move(dx, dy)
    thirdPoint.move(dx, dy)

    println("Przesunięcie: ($dx, $dy)")
    println("Współrzędne po przesunięciu: $firstPoint")
    println("Współrzędne po przesunięciu: $secondPoint")
    println("Współrzędne po przesunięciu: $thirdPoint")

}