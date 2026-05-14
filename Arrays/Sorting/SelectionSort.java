class SelectionSort{
    // Choose the minimum from unsorted part replace it with curr position
    //T.C 0(n2)
    public static int[] selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int minPos = i;
            for(int j = i; j < n; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            swap(arr, minPos, i);
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

        int[] sorted = selectionSort(arr);

        for(int i = 0; i < sorted.length; i++){
            System.out.print(sorted[i] + " ");
        }
    }
}