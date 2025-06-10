import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Layouts {
    public static void main(String[] args) {
        
        JFrame myFrame = new JFrame();
        JPanel root = new JPanel();
        // root.setLayout(new GridLayout(3, 3));

        // for(int i = 0; i < 7; i ++){
        //     root.add(new JButton("btn " + i));
        // }

        // root.setLayout(new BorderLayout());

        // root.add(new JButton("NORTH"), BorderLayout.NORTH);
        // root.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        // root.add(new JButton("EAST"), BorderLayout.EAST);
        // root.add(new JButton("WEST"), BorderLayout.WEST);
        // root.add(new JButton("CENTER"), BorderLayout.CENTER);
        // root.add(new JButton("NORTH"), BorderLayout.NORTH);

        // root.setLayout(new BoxLayout(root, BoxLayout.X_AXIS));
        // root.add(new JButton("1"));
        // root.add(new JButton("2"));
        // root.add(new JButton("3"));
        // root.add(new JButton("4"));
        // root.add(new JButton("5"));
        // root.add(new JButton("6"));

        root.setLayout(new BorderLayout());
        root.add(new JLabel("Please click one button"), BorderLayout.NORTH);
        root.add(new JLabel("Thank you for clicking"), BorderLayout.SOUTH);
        root.add(new JButton("right"), BorderLayout.EAST);
        
        JButton btn = new JButton("left");
        btn.addActionListener((e) -> {
            // myFrame.dispose();

            for(int i = 0; i < 1_000_000_000; i++){
                System.out.println(i);
            }
    

            System.out.println("hello");
        });
        root.add(btn, BorderLayout.WEST);

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(3, 3));

        for(int i = 0; i < 9; i++){
            panel.add(new CustomButton("btn: "));
        }

        root.add(panel, BorderLayout.CENTER);



        



        myFrame.setContentPane(root);
        myFrame.setSize(500, 200);
        myFrame.setVisible(true); 
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setTitle("Layouts");
        myFrame.setResizable(true);


        System.out.println("bottom of main");

    }
}
