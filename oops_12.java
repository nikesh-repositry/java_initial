//this is example code to understand constructor overloading
package oops;

public class oops_12 {
    int x;
    String s;

    // Constructor 1: No parameters
    public oops_12() {
        x = 0;
        s = "Default";
    }

    // Constructor 2: One integer parameter
    public oops_12(int x) {
        this.x = x;
        s = "Unknown";
    }

    // Constructor 3: One string parameter
    public oops_12(String s) {
        this.x = -1;
        this.s = s;
    }

    // Constructor 4: Two parameters (integer and string)
    public oops_12(int x, String s) {
        this.x = x;
        this.s = s;
    }

    public static void main(String[] args) {
        oops_12 obj1 = new oops_12();
        oops_12 obj2 = new oops_12(10);
        oops_12 obj3 = new oops_12("Hello");
        oops_12 obj4 = new oops_12(20, "World");
    }
}
