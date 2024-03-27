import java.util.ArrayList;
import java.util.Collections;
public class findMaximum03 {

    public static void swap(ArrayList<Integer> list,int idx1,int idx2) {
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // find the maximum number 
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < list.size(); i++){
        //     if(max < list.get(i)){
        //         max = list.get(i);
        //     }
        // }
        // System.out.println(max);

        //swap the two numbers
        int idx1 = 1 ,idx2 = 3;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
