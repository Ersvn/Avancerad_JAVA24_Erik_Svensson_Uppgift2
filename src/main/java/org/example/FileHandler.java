package org.example;

import java.io.*;
import java.util.HashMap;

public class FileHandler {

    public static void loadStudentsFromFile() {
        File file = new File("D:\\Spacetravels\\Avancerad_JAVA24_Erik_Svensson_Uppgift2\\src\\main\\java\\datastudents.txt");
        if (!file.exists()) {
            System.out.println("File not found, starting with an empty list.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] studentData = line.split(",");
                String studentId = studentData[0].trim();
                String name = studentData[1].trim();
                String grade = studentData[2].trim();
                StudentManager.getInstance().addStudent(studentId, name, grade);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveStudentsToFile(HashMap<String, Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Spacetravels\\Avancerad_JAVA24_Erik_Svensson_Uppgift2\\src\\main\\java\\datastudents.txt"))) {
            for (Student student : students.values()) {
                writer.write(student.getStudentId() + ", " + student.getName() + ", " + student.getGrade());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



