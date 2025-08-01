public class Student {
    // Attributes (data members) of the Student class
    String name;
    int rollNumber;
    String grade;

    // Constructor to initialize the Student object
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    // Main method to create and use Student objects
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student("Alice Smith", 101, "A");

        // Call the method to display student information
        student1.displayStudentInfo();

        System.out.println("\n--- Another Student ---");

        // Create another Student object
        Student student2 = new Student("Bob Johnson", 102, "B+");
        student2.displayStudentInfo();
    }
}
