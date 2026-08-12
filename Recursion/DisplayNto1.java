package Recursion;

public class DisplayNto1 {
    public static void display(int n,int m){
        if(n<m){
            return;
        }
        System.out.println(n);
        display(n-1,m);
    }

    public static void backDisplay(int i,int n){
        if(i<1){
            return;
        }
        backDisplay(i-1,n);
        System.out.println(i);

    }
    public static void main(String[] args) {
        int n = 5;

        //display(n,1);
        backDisplay(n,n);
    }
}
