//Understand recursion by print something N times

package Recursion;

public class UsingRecursion {

    public static void f(int n){
        if (n <= 0) { 
            return; 
        }
        
        System.out.println("Hello"); 
        
        f(n - 1); 
        
    }
    public static void main(String[] args) {
        int n = 5;
        f(n);
    }
}
