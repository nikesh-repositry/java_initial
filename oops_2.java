// simple program to understand how method works
package oops;
import java.util.Scanner;
class oops{   //created a class name oops with class keyword

    public void car (String color){  //here the method defines and return nothing so here void type is used
        System.out.println("you car will be colored as" + " "+ color);
        //method car takes the input color
    }
}
public class oops_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the color you want ");
        String color = input.nextLine();
        oops obj = new oops();   //create an object of class oops with the name of obj
        obj.car(color);  //passing the input color to the method
    }
}
