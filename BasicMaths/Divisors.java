// TC : O(N)
import java.util.*;
public class Divisors {
    public static void main(String[] args) {
        int n = 36;
        List<Integer> l = new ArrayList<Integer>();

        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                l.add(i);
                //System.out.println(i);

                if((n/i)!=i){
                    l.add(n/i);
                    //System.out.println(n/i);
                }

            }
        }
        l.sort(null);
        System.out.println(l);
    }
}
