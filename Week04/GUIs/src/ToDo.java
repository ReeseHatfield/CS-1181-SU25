import javax.swing.*;

public class ToDo extends JFrame {

    private JPanel root = new JPanel();

    public static void main(String[] args) {
        new ToDo();
    }

    public ToDo(){
        super();

        initComponents();

        this.setContentPane(root);
        this.setSize(500, 500);
        this.setVisible(true); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("ToDo App");
        this.setResizable(true);

    }


    private void initComponents(){
        // add all of our stuff to our root

        // textBox
        // submitBtn

        JTextArea textInput = new JTextArea();
        this.root.add(textInput);

        JButton btn = new JButton("Add ToDo Item");
        btn.addActionListener((e) -> {
            this.root.add(new ToDoItem(textInput.getText()));
            this.root.revalidate();
        });
        this.root.add(btn);

    }
}
