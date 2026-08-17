package Leetcode;

import java.util.HashMap;
import java.util.Scanner;

//Valid Anagram
public class P0242 {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            hm.put(sChar, hm.getOrDefault(sChar, 0) + 1);
            hm.put(tChar, hm.getOrDefault(tChar, 0) - 1);
        }

        for (int i : hm.values()) {
            if (i != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String t : ");
        String s = in.nextLine();
        System.out.print("Enter String s : ");
        String t = in.nextLine();

        System.out.println("Output : " + isAnagram(s, t));
    }
}
