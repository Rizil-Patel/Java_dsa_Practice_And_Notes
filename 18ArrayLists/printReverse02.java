import java.util.ArrayList;
public class printReverse02 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0;i<5;i++) {
            list.add(i+1);
        }
        for(int i = list.size()-1;i>=0;i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
