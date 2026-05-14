//Merge sort follows divide and conqure approach it recursively divide arr into two halfs and sort them and finally merging them back to obtain sorted array

// divide - array into 2 halfs
// conqure - sort them
// merge - merge 2 sorted halfs

//of an element arr[i] is any element arr[j] such that j > i and arr[j] > arr[i].
// Hint to apply merge sort

class MergeSort{
    //T.c 0(nlogn) same for Worst case
    //S.c 0(n) --> temp array
    public static void mergeSort(int[] arr, int si, int ei){
        //base case
        if(si >= ei){
            return;
        }

        int mid = (si + ei) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
        
    }

    public static void merge(int[] arr, int si, int mid, int ei){
        int temp[] = new int[ei - si + 1]; //avoid overriding
        int i = si;
        int j = mid + 1;

        int k = 0; //for temp
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                k++; i++;
            }else{
                temp[k] = arr[j];
                k++; j++;
            }
        }

        //if remaning
        while( i <= mid){
            temp[k++] = arr[i++];
        }

        while( j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temp to original
        for(int idx = 0; idx < temp.length; idx++){
            arr[si+idx] = temp[idx];
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

      mergeSort(arr, 0, arr.length - 1);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}