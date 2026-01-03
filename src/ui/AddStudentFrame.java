package ui;

import model.Student;
import service.StudentService;

import javax.swing.*;

public class AddStudentFrame extends JFrame {

    public AddStudentFrame() {
        setTitle("Add Student");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(null);

        JLabel idLabel = new JLabel("Student ID:");
        idLabel.setBounds(30, 30, 100, 25);

        JTextField idField = new JTextField();
        idField.setBounds(140, 30, 200, 25);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 70, 100, 25);

        JTextField nameField = new JTextField();
        nameField.setBounds(140, 70, 200, 25);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(30, 110, 100, 25);

        JTextField emailField = new JTextField();
        emailField.setBounds(140, 110, 200, 25);

        JLabel deptLabel = new JLabel("Department:");
        deptLabel.setBounds(30, 150, 100, 25);

        JTextField deptField = new JTextField();
        deptField.setBounds(140, 150, 200, 25);

        JLabel gpaLabel = new JLabel("GPA:");
        gpaLabel.setBounds(30, 190, 100, 25);

        JTextField gpaField = new JTextField();
        gpaField.setBounds(140, 190, 200, 25);

        JButton saveBtn = new JButton("Save Student");
        saveBtn.setBounds(140, 240, 120, 30);

        saveBtn.addActionListener(e -> {
            try {
                String id = idField.getText().trim();
                String name = nameField.getText().trim();
                String email = emailField.getText().trim();
                String dept = deptField.getText().trim();
                double gpa = Double.parseDouble(gpaField.getText().trim());

                if (id.isEmpty() || name.isEmpty() || email.isEmpty() || dept.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "All fields are required");
                    return;
                }

                Student student = new Student(id, name, email, dept, gpa);
                StudentService.addStudent(student);

                JOptionPane.showMessageDialog(this, "Student saved successfully");
                dispose();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid GPA value");
            }
        });

        panel.add(idLabel);
        panel.add(idField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(deptLabel);
        panel.add(deptField);
        panel.add(gpaLabel);
        panel.add(gpaField);
        panel.add(saveBtn);

        add(panel);
        setVisible(true);
    }
}
