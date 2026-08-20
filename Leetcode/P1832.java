import java.util.HashMap;
import java.util.HashSet;

public class P1832 {
    public static boolean checkIfPanagram(String sentence){
        // HashMap<Character,Integer> h = new HashMap<>();
        // for(int i =0 ;i<sentence.length();i++){
        //     h.put(sentence.charAt(i) , h.getOrDefault(sentence.charAt(i), 0)+1);
        // }

        // return (h.size() == 26);

        HashSet<Character> h = new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            h.add(sentence.charAt(i));
        }

        return (h.size()==26);
    }

    public static void main(String[] args) {
        //String s = "thequickbrownfoxjumpsoverthelazydog";
        String s = "leetcode";
        System.out.println("Output : " + checkIfPanagram(s));
    }
}
