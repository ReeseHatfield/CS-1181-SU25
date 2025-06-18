import javax.swing.*;
import java.awt.*;

public class ViewTwo extends JFrame {
    private JPanel root = new JPanel();

    public ViewTwo(){

        JComboBox<String> nameOptions = new JComboBox<>();
        nameOptions.addItem("Alice");
        nameOptions.addItem("Bob");
        nameOptions.addItem("Charlie");
        this.root.add(nameOptions);

        JColorChooser choser = new JColorChooser();
        this.root.add(choser);

        JPasswordField passwordInput = new JPasswordField(6);
        this.root.add(passwordInput);

        JButton submitBtn = new JButton("Write to file");
        submitBtn.addActionListener((e) -> {
            // call controller

            DTO dto = new DTO(
                (String) nameOptions.getSelectedItem(),
                choser.getColor(),
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
