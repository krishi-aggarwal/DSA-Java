package Recursion;

public class SumN {

    //1st Approach : Parameterized
    public static int sumParams(int sum , int n){
        if(n<=0){
            return sum;
        }
        return sumParams(sum + n , n-1);
        
    }

    //2nd Approach : Functional
    public static int sumFn(int n){
            if(n==0){return n;}
            return n + sumFn(n-1);
    }

    public static void main(String[] args) {
        int n = 5;

        // System.out.println(sumParams(0,n));
        System.out.println(sumFn(n));
    }
}
