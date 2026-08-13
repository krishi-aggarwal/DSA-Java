package Recursion;

public class PalindromeString {
    
    public static boolean checkPalindrome(int i, String s) {
        // Base case: if pointer reaches or passes the middle, it's a palindrome
        if (i >= s.length() / 2) return true;

        // Compare characters from start and end using index math
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        
        // Recursive step: increment index
        return checkPalindrome(i + 1, s);
    }

    public static void main(String[] args) {
        String s = "0P";
        
        // Clean the string first: removes '0', leaves only "p"
        String cleaned = s.toLowerCase().replaceAll("[^a-zA-Z]", "");
        
        // Pass the cleaned string and start index 0
        System.out.println(checkPalindrome(0, cleaned)); // Outputs: true (since "p" is a palindrome)
    }
}
