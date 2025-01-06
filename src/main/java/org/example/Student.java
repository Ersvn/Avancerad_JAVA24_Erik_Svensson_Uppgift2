package org.example;

public class Student {
    private String studentId;
    private String name;
    private String grade;

    public Student(String studentId, String name, String grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + name + ", Grade: " + grade;
    }
}

