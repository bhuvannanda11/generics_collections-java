import java.io.*;

public class StudentDataStream {

    public static void main(String[] args) {
        String filePath = "students.dat"; // Binary file to store student data

        // Sample student data
        Student[] students = {
            new Student(101, "Alice", 3.8),
            new Student(102, "Bob", 3.6),
            new Student(103, "Charlie", 3.9)
        };

        // Writing student data to file
        writeStudentData(filePath, students);

        // Reading and displaying student data from file
        readStudentData(filePath);
    }

    // Method to write student data to a binary file
    private static void writeStudentData(String filePath, Student[] students) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            for (Student student : students) {
                dos.writeInt(student.rollNumber);
                dos.writeUTF(student.name);
                dos.writeDouble(student.gpa);
            }
            System.out.println("Student data has been written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing data: " + e.getMessage());
        }
    }

    // Method to read student data from a binary file
    private static void readStudentData(String filePath) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            System.out.println("\nReading Student Data:");
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.err.println("Error reading data: " + e.getMessage());
        }
    }
}

// Student class to represent student details
class Student {
    int rollNumber;
    String name;
    double gpa;

    public Student(int rollNumber, String name, double gpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gpa = gpa;
    }
}
