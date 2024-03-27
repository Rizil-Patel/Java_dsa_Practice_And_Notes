public class OOPS01 {
    public static void main(String[] args){
        // created a new pen object p1
        Pen p1 = new Pen();
        p1.setColor("red");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

        // BankAccount acc = new BankAccount();
        // acc.name = "Rizil";
        // acc.setPassword("abckde");
    }
}

// class BankAccount{
//     public String name;
//     private String password;
//     public void setPassword(String pass){
//         password = pass;
//     }
// }

// always write down other classes different from the public class below it 
class Pen {
    private String color;
    private int tip;

    int getTip(){
        return this.tip;
    }
    String getColor(){
        return this.color;
    }
    void setColor(String newcolor) {
        this.color = newcolor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calPercentage(int phy,int chem,int maths){
        percentage = (phy + chem + maths)/3;
    }
}