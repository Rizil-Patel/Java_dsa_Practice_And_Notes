public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        // shark.breathe();
        // shark.swims();
        // shark.color = "blue";
        // System.out.println(shark.color);

        Dog dobby = new Dog();
        dobby.eat();
    }
}

// parent or base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}


// the below three are called the hierarchial inheritance
class Mammal extends Animal {
    int legs;
    void walks(){
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void canSwim() {
        System.out.println("canSwim");
    }
}

class Bird extends Animal {
    void flies(){
        System.out.println("can fly");
    }
}
// this is called the multi level inheritance
class Dog extends Mammal {
    String breed;
}


//this is the single level inheritance
// derived or child
// class Fish extends Animal {
//     int fins;

//     void swims() {
//         System.out.println("Swims in water");
//     }
// }
