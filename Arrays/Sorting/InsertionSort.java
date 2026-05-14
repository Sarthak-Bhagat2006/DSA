class InsertionSort{
    // pick an element from unsorted part and place at its correct position in sorted part
    //T.C 0(n2)
    public static int[] insertionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j - 1]){
                swap(arr, j, j-1);
                j--;
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

        int[] sorted = insertionSort(arr);

        for(int i = 0; i < sorted.length; i++){
            System.out.print(sorted[i] + " ");
        }
    }
}