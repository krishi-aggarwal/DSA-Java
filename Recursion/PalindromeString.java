
//racecar => racecar (Palindrome String)

package Recursion;

public class PalindromeString {
    
    public static boolean checkPalindrome(String s){
        
        if (s == null || s.length() <= 1) {
            return true;
        }
        
        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
        return checkPalindrome(s.substring(1,s.length()-1));
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(checkPalindrome(s.toLowerCase().trim().replaceAll("[^a-zA-Z]", "")));
    }
}
