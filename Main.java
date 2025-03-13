import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("\n---- Student Management System ----");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student Details");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudentById();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option, please choose between 1-4.");
            }
        } while (option != 4);
    }

    static void addStudent() {
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Student Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Student Major: ");
        String major = scanner.nextLine();

        System.out.print("Enter Student GPA: ");
        double GPA = scanner.nextDouble();

        students.add(new Student(name, age, address, major, GPA));
        System.out.println("Student information added successfully!");
    }

    static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : students) {
            student.displayDetails();
        }
    }

    static void searchStudentById() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getStudentId().equals(id)) {
                student.displayDetails();
                return;
            }
        }
        System.out.println("Student not found.");
    }
}

