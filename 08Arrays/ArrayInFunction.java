public class ArrayInFunction {

    // this is done in the way of call by reference to the function 
    // arrays are passed by reference and the normal values are passed by value to the function 
    public static void update(int marks[],int nonchangable){
        nonchangable = 10;
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args){
        int marks[] = {97,98,99};
        int nonchangable = 5;
        update(marks,nonchangable);
        System.out.println(nonchangable);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }    
}
