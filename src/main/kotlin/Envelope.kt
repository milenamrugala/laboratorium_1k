import java.awt.Color
import java.awt.Graphics
import javax.swing.JPanel
class Envelope(private val lines: List<Line>) : JPanel() {
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        for (line in lines) {
            g.color = Color.BLUE
            g.drawLine(line.getX1(), line.getY1(), line.getX2(), line.getY2())
            g.color = Color.BLACK
            g.drawOval(line.getX1() - 2, line.getY1() - 2, 4, 4)
            g.drawOval(line.getX2() - 2, line.getY2() - 2, 4, 4)
        }
    }
}