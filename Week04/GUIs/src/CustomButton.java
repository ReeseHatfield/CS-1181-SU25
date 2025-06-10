import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class CustomButton extends JButton implements ActionListener {


    private static int instanceCount = 1; 

    public CustomButton(String title){
        super(title + instanceCount);

        this.addActionListener(this);

        instanceCount++;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.println(instanceCount);
        JFrame frame = new JFrame();

        Random rng = new Random();
        
        frame.setLocationRelativeTo(null);
        frame.setSize(rng.nextInt(1000), rng.nextInt(500));
        
        frame.setVisible(true);
    }

    
}
