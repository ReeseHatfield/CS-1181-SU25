import javax.swing.*;
import java.awt.*;

public class Ball extends JComponent {

    public int x = 89;
    public int y = 32;
    public int diameter = 50;



    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.RED);
        // g.fillRect(0, 50, 50, 50);

        // g.setColor(Color.CYAN);
        // g.drawOval(0, 0, 50, 50);
        g.fillOval(x, y, diameter, diameter);
    }
}
