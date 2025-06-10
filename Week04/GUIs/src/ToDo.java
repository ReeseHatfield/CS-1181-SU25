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


    }
}
