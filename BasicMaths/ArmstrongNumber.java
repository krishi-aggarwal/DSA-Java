
// TC : O(log10 (N)) 

public class ArmstrongNumber {
    public static void main(String[] args) {
        //int n = 371;
        int n = 1634;

        int original = n;
        int armstrong = 0;
        int digits = (int)Math.log10(n) + 1;
        while(n!=0){
            armstrong = (armstrong) + (int)Math.pow(n%10,digits);
            n = n / 10;
        }
        System.out.println(original == armstrong);
    }
}
