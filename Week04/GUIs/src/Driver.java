import javax.swing.*;

public class Driver{

    public static void main(String[] args) {
        System.out.println("hello");

        JFrame myFrame = new JFrame("My first GUI app");

        // code to add it here

        JPanel root = new JPanel();


        JPanel namePanel = new JPanel();

            JLabel myLabel1 = new JLabel("Reese");
            namePanel.add(myLabel1);

            JLabel myLabel2 = new JLabel("Hatfield");
            namePanel.add(myLabel2);
            
        root.add(namePanel);


        JPanel instructionPanel = new JPanel();

            JLabel instr = new JLabel("Please sign your name: ");
            instructionPanel.add(instr);
            
            JTextArea input = new JTextArea();
            instructionPanel.add(input);

            // JColorChooser choser = new JColorChooser();
            // instructionPanel.add(choser);

            JButton btn = new JButton("Click Me");

            // (e) -> { 
            
        //  }
            btn.addActionListener((e) -> {


                System.out.println(input.getText());

            });
            instructionPanel.add(btn);


            instructionPanel.add(new CustomButton("btn 1"));
            instructionPanel.add(new CustomButton("btn 1"));
            instructionPanel.add(new CustomButton("btn 1"));
            instructionPanel.add(new CustomButton("btn 1"));
            instructionPanel.add(new CustomButton("btn 1"));





        root.add(instructionPanel);

        myFrame.add(root);

        myFrame.setSize(1000, 200);
        myFrame.setVisible(true); 
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setTitle("I changed the title");
        myFrame.setResizable(false);

    }
}