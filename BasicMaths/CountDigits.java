// given number N , we need to count the number of digits


// TC : O(log10 (N ))
public class CountDigits{
    public static void main(String[] args) {
        int n = 15;
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Digit Count : " + count);
    }
}