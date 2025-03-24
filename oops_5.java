//this program shows the working and concept of instance and static method
package oops;

public class oops_5 {
    public void met_a() { // Public instance method
        System.out.println("public method");
    }

    static void met_b() { // Static method
        System.out.println("static method");
    }

    public void met_c(int a, int b, int c) { // Public instance method
        if (a > b && b > c) {
            System.out.println("a is greatest");
        } else if (b > a && a > c) {
            System.out.println("b is greatest");
        } else {
            System.out.println("c is greatest");
        }
    }

    public static void main(String[] args) {
        oops_5 obj = new oops_5(); // Create an instance of oops_5

        obj.met_a(); // Call instance method met_a() using the object
        oops_5.met_b(); // Call static method met_b() using the class name
        obj.met_c(5, 6, 7); // Call instance method met_c() using the object
    }
}
