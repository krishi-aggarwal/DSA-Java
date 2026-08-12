package Recursion;

public class Display1toN {

    public static void display(int m,int n){
        if(m>n){
            return;
        }
        System.out.println(m);
        display(m+1,n);
    }


    public static void backDisplay(int n){
        if(n<=0){
            return;
        }
        backDisplay(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;

        //display(1,n);
        backDisplay(n);
    }
}
