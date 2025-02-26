import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        Scanner yo = new Scanner(System.in);
        System.out.println("Enter the text ");
        char an = yo.next().charAt(2);
        System.out.println(String.valueOf(an));
        System.out.println("write input:");
        String name = yo.nextLine();
        System.out.println("write again:");
        String name2 = yo.nextLine();
        System.out.println("you entered"+name+" " +name2);

    }
}