//this code just show the basic use of wrapper class and its methods
package oops;

public class oops_16 {
    public static void main(String[] args) {
        // Autoboxing
        Integer num = 10;

        // Unboxing and toString
        String numStr = num.toString();
        System.out.println("String: " + numStr);

        // Parsing
        int parsed = Integer.parseInt("20");
        System.out.println("Parsed: " + parsed);

        // Comparison
        Integer num2 = 15;
        int compare = num.compareTo(num2);
        System.out.println("Compare: " + compare);

        // Max/Min
        System.out.println("Max: " + Integer.MAX_VALUE);
        System.out.println("Min: " + Integer.MIN_VALUE);

        //equals
        Integer num3 = 10;
        System.out.println("Equals: " + num.equals(num3));
    }
}
