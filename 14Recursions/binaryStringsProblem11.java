public class binaryStringsProblem11 {
    public static void printBinStrings(int n,int lastplace,String str){

        if(n == 0){
            System.out.println(str);
            return;
        }
        // kaam
        // if(lastplace == 0){
        //     // sit 0 at last place 
        //     printBinStrings(n-1,0, str.append("0"));
        //     printBinStrings(n-1, 1, str.append("1"));
        // }else{
        //     printBinStrings(n-1,0, str.append("0")); 
        // }
 
        printBinStrings(n-1,0, str+"0");
        if(lastplace == 0){
            printBinStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args){
        printBinStrings(3, 0,"");
    }
}
