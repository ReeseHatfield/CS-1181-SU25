import javax.swing.*;
import java.awt.*;

public class ViewOne extends JFrame {
    private JPanel root = new JPanel();

    public ViewOne(){

        JComboBox<String> nameOptions = new JComboBox<>();
        nameOptions.addItem("Alice");
        nameOptions.addItem("Bob");
        nameOptions.addItem("Charlie");
        this.root.add(nameOptions);

        JComboBox<Color> colorOptions = new JComboBox<>();
        colorOptions.addItem(Color.BLUE);
        colorOptions.addItem(Color.CYAN);
        colorOptions.addItem(Color.RED);
        this.root.add(colorOptions);

        JPasswordField passwordInput = new JPasswordField(6);
        this.root.add(passwordInput);

        JButton submitBtn = new JButton("Write to file");
        submitBtn.addActionListener((e) -> {
            // call controller

            DTO dto = new DTO(
                (String) nameOptions.getSelectedItem(),
                (Color) colorOptions.getSelectedItem(),
                new String(passwordInput.getPassword())
            );

            boolean result = Controller.attemptWriteFile(dto);
            
            if (!result) {
                JOptionPane.showMessageDialog(null, "Failed to write to file");
            }


            System.out.println(result);

        });
        this.root.add(submitBtn);


        this.setContentPane(root);
        this.setSize(500, 500);
        this.setVisible(true);
    }
}
