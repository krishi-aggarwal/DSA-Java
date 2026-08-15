package Hashing;

import java.util.Scanner;

public class BasicHashing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = in.nextInt();

        int[] arr = new int[n];
        //creating array

        for(int i=0;i<n;i++){
            System.out.print("Enter Value [" +i+ "]: ");
            arr[i] = in.nextInt();
        }

        System.out.print("Array : ");
        //printing array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        //pre-compute
        //taking highest as 12 so 13!
        int[] hash = new int[13];

        for(int i=0;i<n;i++){
            hash[arr[i]] += 1;
        }

        //fetching
        System.out.print("\nEnter no. of queries : ");
        int q = in.nextInt();

        while(q>0){
            System.out.print("\nEnter Value : ");
            int num = in.nextInt();
            System.out.println(num+" appears "+hash[num]+" times");
            q--;
        }

        System.out.println("\nFinished!");

    }    
}
