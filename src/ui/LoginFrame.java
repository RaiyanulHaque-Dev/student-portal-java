package ui;

import auth.LoginService;
import javax.swing.*;

public class LoginFrame extends JFrame {

    public LoginFrame() {
        setTitle("Student Portal - Login");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(30, 30, 80, 25);

        JTextField userField = new JTextField();
        userField.setBounds(120, 30, 150, 25);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(30, 70, 80, 25);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(120, 70, 150, 25);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(120, 110, 80, 25);

        loginBtn.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());

            if (LoginService.authenticate(user, pass)) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                dispose();
                new DashboardFrame();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials");
            }
        });

        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(loginBtn);

        add(panel);
        setVisible(true);
    }
}
