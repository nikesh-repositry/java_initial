package oops;

// Main class to demonstrate constructors
public class oops_11 {
    public static void main(String[] args) {
        // 1. Default constructor (provided by Java when no constructors are defined)
        Student student1 = new Student();
        student1.displayInfo();

        // 2. No-args constructor (explicitly defined)
        Student student2 = new Student();
        student2.displayInfo();

        // 3. Parameterized constructor
        Student student3 = new Student("Alice", 20);
        student3.displayInfo();

        // 4. Copy constructor
        Student student4 = new Student(student3);
        student4.displayInfo();
    }
}

class Student {
    String name;
    int age;

    // 1. Default constructor (automatically provided by Java if no constructors are defined)
    // In this case, we're not showing it in code because it's implicit
    // It would look like: public Student() {}

    // 2. No-args constructor (explicit version)
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("No-args constructor called");
    }

    // 3. Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    // 4. Copy constructor
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        System.out.println("Copy constructor called");
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println(); // Empty line for spacing
    }
}