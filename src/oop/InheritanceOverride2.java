package oop;

class Animals {
    public void eat(){
        System.out.println("I can eat");
    }
}

class Dogs extends Animals {
    @Override
    public void eat() {
        System.out.println("I can only eat meat");
    }
    public void bark() {
        System.out.println("I can bark");
    }
}
public class InheritanceOverride2 {
    public static void main(String[] args) {
        Dogs labrador = new Dogs();
        labrador.eat();
        labrador.bark();
    }
}
