package Conditional;
import java.util.Scanner;
public class if_else_basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER PLEASE:");
        float num = input.nextFloat();
        if(num%2==0){
            System.out.println("the number is even");
        }
        else {
            System.out.println("the number is odd");
        }

    }
}
