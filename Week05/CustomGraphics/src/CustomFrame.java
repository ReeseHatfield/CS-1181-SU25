import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CustomFrame extends JFrame {

    private JPanel root = new JPanel();
    private Ball b = new Ball();
    

    public CustomFrame() {

        this.root.setLayout(new BoxLayout(this.root, BoxLayout.Y_AXIS));
        this.root.add(b);



        this.setContentPane(root);
        this.setSize(500, 500);
        this.setVisible(true); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Custom graphics");
        this.setResizable(true);

        animate();

    }

    private int deltaX = 2;
    private int deltaY = 2;

    private void animate(){


        int xMin = 0;
        int xMax = this.getWidth();


        int yMin = 0;
        int yMax = this.getHeight();



        Timer t = new Timer(1, (e) -> {
            
            b.x += deltaX;
            b.y += deltaY;
            b.repaint();
            // logic 

            // handle X

            if (b.x < xMin || b.x + b.diameter > xMax) {
                // break it up into another class
                // or you promote the scope of the variable
                deltaX *= -1;
            }

            if(b.y < yMin || b.y  + b.diameter> yMax) {
                deltaY *= -1;
            }


        });

        t.setRepeats(true);
        t.start();


    }

}
