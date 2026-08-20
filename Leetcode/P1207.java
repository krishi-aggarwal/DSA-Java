import java.util.HashMap;
import java.util.HashSet;

public class P1207 {
    
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            h.put(arr[i] , h.getOrDefault(arr[i], 0)+1);
        }

        HashSet<Integer> hs = new HashSet<>();
        for(int i : h.values()){
            hs.add(i);
        }

        return h.size() == hs.size();
    }
    
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};

        System.out.println("Output : " + uniqueOccurrences(arr));
    }
}
