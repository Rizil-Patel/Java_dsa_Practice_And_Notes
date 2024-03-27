public class MethodOverloading04 {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5,6));
        System.out.println(calc.sum(5.4f,6.3f));
        System.out.println(calc.sum(5,6,8));
        Deer d1 = new Deer();
        d1.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}

// this is called the method overriding or run time overloading

class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}

// this is called function overloading or method overloading and it is done at the compile time overloading
class Calculator{
    int sum(int a,int b){
        return a + b;
    }

    float sum(float a,float b){
        return a + b;
    }

    int sum(int a,int b,int c){
        return a + b + c;
    }
}