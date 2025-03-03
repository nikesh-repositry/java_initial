//example of staic and instance methods in java
class Example {
    int instanceVar = 10;
    static int staticVar = 20;
}

public class methodsExample {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        System.out.println(Example.staticVar); // 20
        System.out.println(obj1.staticVar);    // 20
        System.out.println(obj2.staticVar);    // 20
        System.out.println("------------------------------------");

        Example.staticVar = 40; // Changed the static variable

        System.out.println(Example.staticVar); // 40 (Class name)
        System.out.println(obj1.staticVar);    // 40 (Object reference)
        System.out.println(obj2.staticVar);    // 40 (Object reference)
        System.out.println("------------------------------------");



        System.out.println(obj1.instanceVar); // 10 (Object reference)
        System.out.println(obj2.instanceVar); // 10 (Object reference)
        // System.out.println(Example.instanceVar); // Compile-time error!
        System.out.println("------------------------------------");

        obj1.instanceVar = 30;

        System.out.println(obj1.instanceVar); // 30 (Object reference)
        System.out.println(obj2.instanceVar); // 10 (Object reference)
        // System.out.println(Example.instanceVar); // Compile-time error!
    }
}