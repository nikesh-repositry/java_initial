//this program is show the working concept of overload method
//we dont know that what number of digit 2 or 3 user want to add
package oops;
import java.util.Scanner;
public class oops_6 {
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("choose between 3 or 2");
        int num = input.nextInt();
        oops_6 obj = new oops_6();
        if(num == 2){
            System.out.println("enter the number a");
            int numa = input.nextInt();
            System.out.println("enter the number b");
            int numb = input.nextInt();
            System.out.println("sum of two digits are "+ obj.sum(numa,numb));
//            System.out.println("sum of two digits are " + obj.sum(input.nextInt(), input.nextInt()));
        }
        else if(num == 3){
            System.out.println("enter the number a");
            int numc = input.nextInt();
            System.out.println("enter the number b");
            int numd = input.nextInt();
            System.out.println("enter the number c");
            int nume = input.nextInt();
            System.out.println("sum of three digits are "+ obj.sum(numc,nume,numd));
//            System.out.println("sum of three digits are " + obj.sum(input.nextInt(), input.nextInt(), input.nextInt()));
        }
        else {
            System.out.println("choose two or three only");
        }
        input.close();
    }
}