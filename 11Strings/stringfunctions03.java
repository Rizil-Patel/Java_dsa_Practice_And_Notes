public class stringfunctions03 {
    public static void main(String[] args){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if(s1 == s2){
            System.out.println("string are equal");
        }else{
            System.out.println("Sting are not equal");
        }

        //because the == checks that the string passed are same at the object level or not
        if(s1 == s3){
            System.out.println("string are equal");
        }else{
            System.out.println("Sting are not equal");
        }

        //the equals check at the value level if the string are equal or not
        if(s1.equals(s3)){
            System.out.println("string are equal");
        }else{
            System.out.println("string are not equal");
        }
    }
}
