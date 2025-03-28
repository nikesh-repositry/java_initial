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
        input.nextLine();

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
