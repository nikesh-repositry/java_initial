//this program show the calling of parent members using super() keyword
package oops;
class parent{
    public parent(){
        System.out.println("parent no-args constructor executed");
        parentMethod1();
    }
    public parent(String message){
        System.out.println("parent string constructor executed");
        parentMethod2(message);
    }
    public void parentMethod1(){
        System.out.println("parent method1 executed");
    }
    public void parentMethod2(String message){
        System.out.println("parent method2 executed with message "+" "+message);
    }
}
class child extends parent{
    public child(){
        super();
        System.out.println("child constructor with no argument executed");
    }
    public child(String message){
        super(message);
        System.out.println("child class string constructor executed with message"+" "+message);
    }
}

public class oops_20 {
    public static void main(String[] args) {
        child obj1 = new child();
        System.out.println("--------------------------------");
        child obj2 = new child("HELLO THERE");
    }
}
