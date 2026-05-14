class BubbleSort{
    // Larger element bubble up and get at the end by adjacent swapping
    //T.C 0(n2)
    public static int[] bubbleSort(int[] arr){
        int n = arr.length;

        for(int i = n - 1; i >= 1; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }

        return arr;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        int[] sorted = bubbleSort(arr);

        for(int i = 0; i < sorted.length; i++){
            System.out.print(sorted[i] + " ");
        }
    }
}