package oops;
final class FinalClass {
    final int finalVar = 10;

    final void finalMethod() {
        System.out.println("Final method, cannot be overridden.");
        // finalVar = 20; // Error: Cannot assign a value to final variable 'finalVar'
    }

    void nonFinalMethod() {
        System.out.println("Non-final method, can be overridden.");
    }
}

// Error: Cannot inherit from final class 'FinalClass'
// class SubClass extends FinalClass {
//     @Override
//     void finalMethod() { // Error: Cannot override final method
//         System.out.println("Trying to override final method");
//     }
// }

public class oops_18 {
    public static void main(String[] args) {
        final int localFinalVar = 5;
        // localFinalVar = 6; // Error: Cannot assign a value to final variable 'localFinalVar'
        System.out.println("Final local variable: " + localFinalVar);

        FinalClass fc = new FinalClass();
        System.out.println("Final variable in class: " + fc.finalVar);
        fc.finalMethod();
        fc.nonFinalMethod();
    }
}