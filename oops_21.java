//this program shows the working of method overriding in inheritance
package oops;
class  A {
    String name;
    A (String name){
        this.name=name;
    }
    void instanceMethod(){
        System.out.println(name+"parent instance method");
    }
    static void staicMethod(){
        System.out.println("parent static method");
    }
    final void finalMethod(){
        System.out.println(name+"parent final method");
    }
}
class B extends A{
    B(String name){
        super(name);
    }

    @Override
    void instanceMethod() {
        super.instanceMethod();
        System.out.println(name+"child instance method");
    }
    static void staticMethod(){
        System.out.println("static child class method");
    }
}
public class oops_21 {
    public static void main(String[] args) {
        A obj1 = new A("this is "); 
        A obj2 = new B("THIS is "); //reference type A(superclass) and object type B(subclass) concept used = upcasting
        B obj3 = new B("THAT is "); //reference type B(subclass) and object type B(subclass)

        System.out.println("method overriding-------");
        obj1.instanceMethod(); //call the parent instancemethod
        obj2.instanceMethod(); //call the child class instancemethod
        obj3.instanceMethod(); //-------""-------

        System.out.println("final method-----------");
        obj1.finalMethod(); //call parent final method
        obj2.finalMethod(); //call the parent class final method through child class because child class B can access it 
        //also final method cannot be override
        obj3.finalMethod(); //---------------""-----------------

        System.out.println("static method hiding--------");
        A.staicMethod(); //parent static method called
        B.staticMethod(); //child class static method is callec

    }
}
