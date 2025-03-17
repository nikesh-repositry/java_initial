//this program shows the working of var args in java
package oops;

public class oops_7 {
    // Method using varargs to print names
    public static void printNames(String... names) {
        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    // Method using varargs to sum numbers
    public static void sumNumbers(int... numbers) {
        int sum = 0;
        System.out.println("Numbers:");
        for (int number : numbers) {
            System.out.println(number);
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }

    // Method using varargs with other parameters
    public static void printInfo(String info, int... numbers) {
        System.out.println("Info: " + info);
        System.out.println("Numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        // Calling printNames with varargs
        System.out.println("Calling printNames:");
        printNames("John", "Jane", "Bob");

        // Calling sumNumbers with varargs
        System.out.println("\nCalling sumNumbers:");
        sumNumbers(1, 2, 3, 4, 5);

        // Calling printInfo with varargs and other parameters
        System.out.println("\nCalling printInfo:");
        printInfo("Example", 10, 20, 30);
    }
}
