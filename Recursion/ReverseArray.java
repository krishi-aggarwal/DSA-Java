//reversing array using recursion

package Recursion;

public class ReverseArray {

    //using two pointer approach
    public static int[] reverseArray(int l , int r ,int[] arr){
        if(l>=r){
            return arr;
        }

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        return reverseArray(l+1, r-1, arr);

    }

    //using single pointer approach
    public static int[] reverseArray(int i,int[] arr ,int n){
        if(i>=n/2){
            return arr;
        }

        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        return reverseArray(i+1,arr,n);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //arr = reverseArray(0,arr.length-1,arr);
        arr = reverseArray(0, arr, arr.length);
        for(int i : arr){
            System.out.print(i + " "); 
        }
        
    }
    

}
