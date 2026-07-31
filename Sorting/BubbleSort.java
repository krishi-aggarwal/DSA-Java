public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,1,4,2,8};

        for(int i : arr){
            System.out.print(i+" ");
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
