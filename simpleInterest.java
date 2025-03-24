//simple program to find interest of any amount
import java.sql.SQLOutput;
import java.util.Scanner;
public class simpleInterest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the principle:");
        float ab = input.nextFloat();
        System.out.printf("Enter the rate:");
        float ac = input.nextFloat();
        System.out.printf("Enter the time in years:");
        float aa = input.nextFloat();
        float ad = (aa*ab*ac)/100;
        System.out.printf("the amount to pay is:"+" "+ad);
    }
}
