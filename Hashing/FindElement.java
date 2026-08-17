package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter Size(N) : ");
        n = in.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element " + i + ": ");
            arr[i] = in.nextInt();
        }

        // Printing array
        System.out.print("\nArray elements: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Pre-compute using HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        // Printing hashmap
        System.out.println("Frequency Map: " + hm);

        // Variables to store the elements with max and min frequencies
        int maxEle = 0, minEle = 0;
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();

            // Track highest frequency element
            if (frequency > maxFreq) {
                maxFreq = frequency;
                maxEle = element;
            }

            // Track lowest frequency element
            if (frequency < minFreq) {
                minFreq = frequency;
                minEle = element;
            }
        }

        System.out.println("Highest frequency element: " + maxEle + " (Frequency: " + maxFreq + ")");
        System.out.println("Lowest frequency element: " + minEle + " (Frequency: " + minFreq + ")");
    
    }
}
