import java.util.*;
public class ShortestPath {
    public static float shortestPath(String path){
        int y = 0,x = 0;
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'W'){
                x--;
            }
            else if(path.charAt(i) == 'E'){
                x++;
            }
            else if(path.charAt(i) == 'N'){
                y++;
            }
            else{
                y--;
            }
        }
        float distance = (float)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        float ans = shortestPath(path);
        System.out.println("The shortestPath requrired: " + ans);
    }
}
