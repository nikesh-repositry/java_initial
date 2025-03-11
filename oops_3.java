//example to understand the concept of static and instance attributes of class
package oops;
class test{
    String col1 = "BLUE";
    static String col2 = "RED";
}
public class oops_3 {
    public static void main(String[] args) {
        test obj1 = new test();
        test obj2 = new test();

        System.out.println(obj1.col1);
        System.out.println(obj1.col2); //col2 static attribute can be access via object of the class
        //but it is not preferred to access static variable through class object it makes confusion among developers
        //calling static via class name signifies that the attribute is static and shared same among all
        System.out.println(obj2.col1);
        System.out.println(test.col2);
//      System.out.println(test.col1);  //calling instance variable via class name is ot possible

        System.out.println("--------------------");
        //now here we can see if the we change the value of both static and instance variable so then the value
        //got change for all or not
        obj1.col1="BLACK";
        obj1.col2="WHITE"; // here changing the value of static variable via object can be dont but not a best practice
        test.col2="WHITE"; // change the static variable via class name not object of class
        System.out.println(obj1.col1); //value changed
        System.out.println(obj1.col2); //value changed
        System.out.println(obj2.col1); //value unchanged
        System.out.println(obj2.col2); //value change
        //hence instance variable value not changed for everyone because all they the copy of that variable
        //they dont have the real variable but in static if changed the value then it is changed for everyone

    }
}
