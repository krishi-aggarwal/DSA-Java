// TC : O(log10 (N))


public class ReverseInteger {

    public static int reverse(int x) {
        int rev=0;
        int lastDigit=0;

        while(x!=0){

            if(rev > Integer.MAX_VALUE / 10) return 0;
            if(rev < Integer.MIN_VALUE / 10) return 0;

            lastDigit = x % 10;
            rev = (rev*10) + lastDigit;
            x = x / 10;
        }

        return rev;
    }
    public static void main(String[] args) {
        int n = -321;
        System.out.println(reverse(n));
    }
}
