package model;

public class Student {

    private String id;
    private String name;
    private String email;
    private String department;
    private double gpa;

    public Student(String id, String name, String email, String department, double gpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.gpa = gpa;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getDepartment() { return department; }
    public double getGpa() { return gpa; }

    // Convert object → file line
    public String toFileString() {
        return id + "," + name + "," + email + "," + department + "," + gpa;
    }

    // Convert file line → object
    public static Student fromFileString(String line) {
        String[] parts = line.split(",");
        return new Student(
                parts[0],
                parts[1],
                parts[2],
                parts[3],
                Double.parseDouble(parts[4])
        );
    }
}
