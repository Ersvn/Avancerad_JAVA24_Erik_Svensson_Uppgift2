package org.example;

import java.util.HashMap;

public class StudentManager {
    private static StudentManager instance;
    private HashMap<String, Student> students = new HashMap<>();

    public static StudentManager getInstance() {
        if (instance == null) {
            instance = new StudentManager();
        }
        return instance;
    }

    public void addStudent(String studentId, String name, String grade) {
        Student student = new Student(studentId, name, grade);
        students.put(studentId, student);
    }

    public Student getStudentById(String studentId) {
        return students.get(studentId);
    }

    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    public HashMap<String, Student> getAllStudents() {
        return students;
    }
}



