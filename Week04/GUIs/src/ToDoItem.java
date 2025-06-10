import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ToDoItem extends JPanel {
    public ToDoItem(String text){
        // label -> whatever the item is
        // btn -> delete it


        this.add(new JLabel(text));
        JButton btn = new JButton();
        btn.addActionListener((e) -> {
            this.removeAll();
            this.revalidate();
        });
        this.add(btn);
    }
    
}
