import java.util.ArrayList;

// import java.util.*;  it is used to call all the properties
public class syntax01 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Adding elements in arraylist with TC O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(1,56);
        System.out.println(list);

        // Get - TC O(1)
        // int element = list.get(3);
        // System.out.println(element);

        // Delete - TC O(n)
        // list.remove(2);
        // System.out.println(list);

        // Set Element - TC O(n) 
        // list.set(2,10);
        // System.out.println(list);

        //O(n)
        // System.out.println(list.contains(11));

        // size is an method
        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+"-");
        }
    }    
}
