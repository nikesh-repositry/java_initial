//this code consist the example which includes all the scopes in java 
package oops;

public class oops_9 {

    // 1. Class Scope (Instance Variable)
    public String instanceVar = "Instance Variable";

    // 4. Static Scope (Static Variable)
    public static int staticVar = 100;

    // Constructor Scope (Constructor Parameter)
    public oops_9(int constructorParam) {
        // Constructor Scope (Local Variable)
        int constructorLocal = constructorParam + 10;
        System.out.println("Constructor Local: " + constructorLocal);
        System.out.println("Constructor Param: " + constructorParam);
        System.out.println("Instance Variable in Constructor: " + instanceVar);
        System.out.println("Static Variable in Constructor: " + staticVar);
    }

    // Instance Method
    public void instanceMethod(int methodParam) {
        // 2. Method Scope (Local Variable)
        String methodLocal = "Method Local";
        System.out.println("Method Local: " + methodLocal);
        System.out.println("Method Param: " + methodParam);
        System.out.println("Instance Variable in Method: " + instanceVar);
        System.out.println("Static Variable in Method: " + staticVar);

        // 3. Block Scope (Variable in if block)
        if (true) {
            int blockVar = 50;
            System.out.println("Block Variable: " + blockVar);
        }
        // System.out.println("Block Variable: " + blockVar); // Error: blockVar not in scope here
    }

    // Static Method
    public static void staticMethod(int staticMethodParam) {
        // Method Scope (Local variable in static method)
        int staticMethodLocal = 200;
        System.out.println("Static Method Local: " + staticMethodLocal);
        System.out.println("Static Method Param: " + staticMethodParam);
        System.out.println("Static Variable in Static Method: " + staticVar);
        // System.out.println("Instance Variable in Static Method: " + instanceVar); // Error: instanceVar not accessible here
    }

    public static void main(String[] args) {
        oops_9 obj = new oops_9(10);
        obj.instanceMethod(20);
        staticMethod(30);
    }
}

/*
Output:
Constructor Local: 20
Constructor Param: 10
Instance Variable in Constructor: Instance Variable
Static Variable in Constructor: 100
Method Local: Method Local
Method Param: 20
Instance Variable in Method: Instance Variable
Static Variable in Method: 100
Block Variable: 50
Static Method Local: 200
Static Method Param: 30
Static Variable in Static Method: 100
*/
