//this is the example code of command line argument
//but to run this i used the intellij idea terminal
//command i used is javac src/oops/oops_8.java to first compile the file
//then java -cp src oops.oops_8 arg1 arg2 etc
//cp for class path 
package oops;
public class oops_8 {
    public static void main(String[] args) {

        for(int i = 0; i < args.length; i++)
            System.out.println("args " + i + args[i]);

    }
}
