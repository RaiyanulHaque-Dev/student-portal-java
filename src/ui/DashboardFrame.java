package ui;

import javax.swing.*;

public class DashboardFrame extends JFrame {

    public DashboardFrame() {
        setTitle("Student Portal - Dashboard");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(null);

        JButton addStudentBtn = new JButton("Add Student");
        addStudentBtn.setBounds(120, 50, 150, 30);

        JButton viewStudentBtn = new JButton("View Students");
        viewStudentBtn.setBounds(120, 100, 150, 30);

        addStudentBtn.addActionListener(e -> new AddStudentFrame());
        viewStudentBtn.addActionListener(e -> new ViewStudentsFrame());

        panel.add(addStudentBtn);
        panel.add(viewStudentBtn);

        add(panel);
        setVisible(true);
    }
}
