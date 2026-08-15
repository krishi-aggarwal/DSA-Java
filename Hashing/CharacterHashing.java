package Hashing;

import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = in.nextLine().toLowerCase();
        System.out.println(s);
        int[] hash = new int[26];
        //can take int[256] 

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
           
            if (ch >= 'a' && ch <= 'z') {
                hash[ch - 'a'] += 1; // Explicit (int) casting is optional in Java
            }
        }

        System.out.print("Enter number of Queries to check : ");
        int q = in.nextInt();
        int totalQueries = q;
        while(q>0){
            System.out.print((totalQueries - q + 1)+" Enter Character to Check : ");
            char c = in.next().toLowerCase().charAt(0);
            System.out.println(c+" appears " + hash[((int)c - (int)'a')]);
            q--;
        }

        System.out.println("\nFinished!");
    }
}
