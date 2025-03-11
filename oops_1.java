//simple program to understand basic class and object
package oops;
class car{  //class car are created
    String carName = "BMW";  //here attributes of class car are created
    String carSeries = "S";
    Integer price = 600000;
}
public class oops_1 {
    public static void main(String[] args) {
        car obj = new car();  //created an object of car class
        System.out.println(obj.carName);   //printing the attribute of class car through object.
        System.out.println(obj.carSeries);
        System.out.println(obj.price);


    }
}