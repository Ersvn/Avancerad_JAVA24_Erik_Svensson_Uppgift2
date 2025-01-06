package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileHandler.loadStudentsFromFile();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add a Student");
            System.out.println("2. Search Student-ID");
            System.out.println("3. Show All Students");
            System.out.println("4. Save Student to File");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String studentId = scanner.next();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Grade (A-F): ");
                    String grade = scanner.next();

                    StudentManager.getInstance().addStudent(studentId, name, grade);
                    break;

                case 2:
                    System.out.print("Enter Student ID: ");
                    studentId = scanner.next();
                    Student student = StudentManager.getInstance().getStudentById(studentId);
                    if (student != null) {
                        System.out.println("Student Found: " + student);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 3:
                    StudentManager.getInstance().showAllStudents();
                    break;

                case 4:
                    FileHandler.saveStudentsToFile(StudentManager.getInstance().getAllStudents());
                    System.out.println("Students saved to file.");
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}




