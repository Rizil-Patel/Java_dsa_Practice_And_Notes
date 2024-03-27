// set the righmost unset bit 

public class Questions02 {
    public static int setBits(int N){
        int x=N;

        while((x&1)!=0)
        {
            x=x>>1;
        }

        if(x==0)
        {
            return N;
        }

        return N | (N+1);
    }
}
