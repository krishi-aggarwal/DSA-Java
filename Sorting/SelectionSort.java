class SelectionSort{
    public static void main(String[] args){
        int[] arr = {5,3,2,1,7};

        for(int i:arr){
            System.out.print(i + " ");
        }

        for(int i=0;i<arr.length-1;i++){
            //will store the last minimum value
            int minIndex = i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    //finding min index in the unsorted array
                    minIndex = j;
                }
            }
            //to avoid self-swap
            if(minIndex!=i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            
        }

        System.out.println();
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}