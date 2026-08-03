public class PalindromeNumber{

    public static boolean isPalindrome(int x){
        int original = x;
        int rev = 0;
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;
        while(x!=0){
            rev = (rev * 10) + (x % 10);
            x = x / 10;            
        }
        return original == rev;
    }
    public static void main(String[] args) {
        int x = -121;
        System.out.println("isPalindrome : "+isPalindrome(x));
    }
}