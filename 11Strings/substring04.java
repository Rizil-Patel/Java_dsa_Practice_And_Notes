public class substring04 {
    public static String findSubstring(String str,int si,int ei){
        String substr = "";
        for(int i = si; i < ei; i++){
            substr += str.charAt(i);
        }
        return substr;	
    }
    public static void main(String[] args){
        String str = "helloworld";
        System.out.println(findSubstring(str, 3, 7));
        System.out.println(str.substring(0,5));
    }
}
