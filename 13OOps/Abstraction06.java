public class Abstraction06 {
    public static void main(String[] args){
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color);

        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();

        Mustang horse122 = new Mustang();
        // animal --> horse --> Mustang 
        
        // here the below line will give the error because the instance of the abstract class cannot be created 
        // Animal a1 = new Animal();
    }
}

abstract class Animal{
    String color;

    Animal(){
        color = "brown";
        System.out.println("animal constructor is called");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{

    Horse(){
        System.out.println("horse constructor is called");
    }
    void changeColor(){
        color = "dark brown";
    }  
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }  
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}