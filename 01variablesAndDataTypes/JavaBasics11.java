public class JavaBasics11 {
    public static void main(String[] args){
        //wrong
        // byte b = 5;
        // b = b*2;
        // becaue the above statement is the expression and for it the java converts it into the int and b is the byte so it is wrong

        //right
        byte b = 5;
        b = (byte)(b*2);
    }
}
