//this is basic code example to understand this keyword 
//here input take name and age of two employee and this keyword helos
//to set the current passed argument to the method
package oops;
import java.util.Scanner;
class job{
    String name;
    int age;

    public void info(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void data(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
}
public class oops_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        job object1 = new job();
        job object2 = new job();
        System.out.println("enter details of empolyee A");
        System.out.println("enter the name");
        String first = input.nextLine();
        System.out.println("enter the age");
        int second = input.nextInt();
        input.nextLine();// here this line is very useful and used many times
        //whenever any input given nextint or nextdouble the input buffer takes it 
        //and when you typed enter button it takes that enter as a input and nextline
        //consider that enter as input and move forward so this is why we use it

        System.out.println("enter details of empolyee B");
        System.out.println("enter the name");
        String third = input.nextLine();
        System.out.println("enter the age");
        int fourth = input.nextInt();

        object1.data(first,second);
        object2.data(third,fourth);

//        input.close();
    }
}
