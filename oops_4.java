//this file contain basic example of types of methods
package oops;
public class oops_4 {
    public static void main(String[] args) {
        System.out.println("types of methods in java");
        System.out.println("------------------------built in method");
        // public class BuiltInExample {
        //    public static void main(String[] args) {
        //        double squareRoot = Math.sqrt(25.0); // Math.sqrt() is a built-in method
        //        System.out.println("Square root: " + squareRoot);
        //    }
        //}
        System.out.println("------------------------user defined method");
        // public class UserDefinedExample {
        //    public static int add(int a, int b) { // add() is a user-defined method
        //        return a + b;
        //    }
        //
        //    public static void main(String[] args) {
        //        int sum = add(5, 3);
        //        System.out.println("Sum: " + sum);
        //    }
        //}
        System.out.println("------------------------instance method");
        //public class Calculator {
        //    public int add(int a, int b) { // Instance method
        //        return a + b;
        //    }
        //}
        System.out.println("-------------------------static method");
        // public class MathUtils {
        //    public static int multiply(int a, int b) { // Static method
        //        return a * b;
        //    }
        //}
        System.out.println("-------------------------finalize method");
        // public class FinalizeExample {
        //    @Override
        //    protected void finalize() {
        //        System.out.println("Finalized");
        //    }
        //
        //    public static void main(String[] args) {
        //        new FinalizeExample();
        //        System.gc();
        //    }
        //}
        System.out.println("-------------------------constructor method");
        // public class Car {
        //    private String model;
        //
        //    public Car(String model) { // Constructor method
        //        this.model = model;
        //    }
        //}
        System.out.println("-------------------------getter and setter method");
        // public class Student {
        //    private String name;
        //
        //    // Getter method
        //    public String getName() {
        //        return name;
        //    }
        //
        //    // Setter method
        //    public void setName(String name) {
        //        this.name = name;
        //    }
        //}
        System.out.println("--------------------------overloaded method");
        //  public class Printer {
        //    public void print(String text) { // Overloaded method
        //        System.out.println(text);
        //    }
        //
        //    public void print(int number) { // Overloaded method
        //        System.out.println(number);
        //    }
        //}
        System.out.println("--------------------------recursive method");
        // public class Factorial {
        //    public int factorial(int n) { // Recursive method
        //        if (n == 0) return 1;
        //        return n * factorial(n - 1);
        //    }
        //}
    }
}
