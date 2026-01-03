package service;

import model.Student;
import util.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private static final String FILE_PATH = "data/students.txt";

    public static void addStudent(Student student) {
        FileUtil.writeLine(FILE_PATH, student.toFileString());
    }

    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        for (String line : FileUtil.readAllLines(FILE_PATH)) {
            students.add(Student.fromFileString(line));
        }
        return students;
    }
}
