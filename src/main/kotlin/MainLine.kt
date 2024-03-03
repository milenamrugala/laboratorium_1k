// Milena Mrugała, zadanie nr 2

import javax.swing.JFrame
fun main()  {

    val lines = arrayOf(
        Line(0, 0, 600, 0), //AB
        Line(600, 0, 600, 300), //BC
        Line(600, 300, 300, 600), //CE
        Line(300, 600, 0, 300), //ED
        Line(0, 300, 0, 0), //DA
        Line(0, 0, 600, 300), //AC
        Line(600, 300, 0, 300), //CD
        Line(0, 300, 600, 0) //DB
    )

    for ((index, line) in lines.withIndex()) {
        println("Linia ${index + 1}: $line")
    }

    val frame = JFrame("Envelope Visualization")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(700, 700)

    val drawingPanel = Envelope(lines.toList())
    frame.contentPane.add(drawingPanel)

    frame.isVisible = true
}