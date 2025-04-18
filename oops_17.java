//this is code to show non static inner class working
package oops;

public class oops_17 {
    void mett() {
        System.out.println("this is outer class method");  //this is outer class method
    }
        private String out = "this is outer class private attribute"; 
    class inner{
        void met(){    //this is inner class method which have access of outer class attributes
            System.out.println("this is inner");  
            System.out.println(out);
        }
    }

    public static void main(String[] args) {
        oops_17 obj = new oops_17();
        oops_17.inner obj1 = obj.new inner();
        obj1.met();
        obj.mett();
    }
}
