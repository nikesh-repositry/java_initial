//this is the example to demonstrate the concept of access modifiers in java
package oops;

class Example {
    public int publicVar = 1;     // Public variable
    private int privateVar = 2;   // Private variable
    protected int protectedVar = 3; // Protected variable
    int defaultVar = 4;           // Default variable (package-private)

    public void publicMethod() {
        System.out.println("Public Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    public void accessPrivate(){
        System.out.println(privateVar+" this is private variable access within the class");
    }
}

public class oops_15 {
    public static void main(String[] args) {
        Example obj = new Example();

        // Accessing public members
        System.out.println("Public Variable: " + obj.publicVar);
        obj.publicMethod();

        // Accessing protected, default members (allowed within the same package)
        System.out.println("Protected Variable: " + obj.protectedVar);
        obj.protectedMethod();

        System.out.println("Default Variable: " + obj.defaultVar);
        obj.defaultMethod();

        // Private members cannot be accessed outside the class
        // System.out.println(obj.privateVar);  // Error!
        // obj.privateMethod();  // Error!
        obj.accessPrivate();
    }
}
