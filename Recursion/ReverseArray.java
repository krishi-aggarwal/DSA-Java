//reversing array using recursion

package Recursion;

public class ReverseArray {

    public static int[] reverseArray(int l , int r ,int[] arr){
        if(l>=r){
            return arr;
        }

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        return reverseArray(l+1, r-1, arr);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = reverseArray(0,arr.length-1,arr);
        for(int i : arr){
            System.out.print(i + " "); 
        }
        
    }
    

}
