//more optimized rather than using O(N) we can use O(sqrt(N))

public class CheckPrime {
    public static void main(String[] args) {
        int n = 5;

        int count = 0;

        for(int i=1;i*i <= n;i++){
            if(n%i == 0){
                count++;

                if((n/i != i)) count++;
            }
        }

        if(count == 2) {
            System.out.println(n+" Its Prime!");
        }
        else System.out.println(n+" Its NOT Prime!");
    }
}
