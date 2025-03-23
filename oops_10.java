/* addition of two numbers using class method and constructor
* in order to understand the concept of class method  and constructor*/
package oops;

public class oops_10 {

    private int number1; // Instance variable

    // Constructor: Initializes number1
    public oops_10(int initialValue) { // **initialValue** is the constructor parameter
        this.number1 = initialValue; // **initialValue** is used to set the instance variable
    }

    // Class Method: Adds number2 to number1
    public int addWithMethod(int number2) { // **number2** is the method parameter
        return this.number1 + number2; // **number2** is used in the method's logic
    }

    public static void main(String[] args) {
        // Create an object, passing an argument to the constructor
        oops_10 operations = new oops_10(10); // 10 is the constructor argument

        // Call the class method, passing an argument
        int result = operations.addWithMethod(5); // 5 is the method argument

        System.out.println("Result: " + result); // Output: Result: 15
    }
}