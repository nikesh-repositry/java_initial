package oops;
class animal {   //root parent class
    void eat(){
        System.out.println("animal is eating ROOT PARENT CLASS");
    }
}
class dog extends animal { //single inheritance
    void bark(){
        System.out.println("dog barks");
    }
}
class bulldog extends dog { //multilevel inheritance
    void guard(){
        System.out.println("bulldog guards");
    }
}
class cat extends animal{ //hierarchical inheritance
    void meow(){
        System.out.println("cat meows");
    }
}
public class oops_22 {
    public static void main(String[] args) {
        dog obj1 = new dog();
        obj1.bark();  //dog method
        obj1.eat();  //inherited from animal
        bulldog obj2 = new bulldog();
        obj2.guard(); //bulldog method
        obj2.bark(); //inherited from dog
        obj2.eat(); //inherited from animal
        cat obj3 = new cat();
        obj3.meow(); //cat method
        obj3.eat(); //inherited from animal
    }
}
