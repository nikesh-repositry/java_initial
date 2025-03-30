//this example demonstrate constructor chaining that how does it execute 
package oops;
class laptop{
    String brand;
    int ram;

    laptop(String brand){
        this.brand=brand;
        this.ram=256;
        System.out.println("first constructor");
    }

    laptop(String brand, int ram){
        this(brand);
        this.ram=ram;
        System.out.println("second constructor");
    }
}

public class oops_14 {
    public static void main(String[] args) {
        laptop obj1 = new laptop("hp");                           //invoke constructor1 
        laptop obj2 = new laptop("lenovo",512);                   //invoke constructor2 which chained with constuctor1 

        System.out.println("brand is  "+obj1.brand +"  ram is  "+ obj1.ram);
        System.out.println("brand is  "+obj2.brand +"  ram is  "+ obj2.ram);
    }
}
