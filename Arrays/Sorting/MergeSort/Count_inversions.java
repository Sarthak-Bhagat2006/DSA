// Given an array of integers arr[]. You have to find the Inversion Count of the array. 
// Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].


//Brute force check for each element which take 0(n2)


class Count_inversions{

    public static int countInverstions(int[] arr, int si, int ei){
        if(si >= ei){
            return 0;
        }

        int mid = (si + ei) / 2;

        int left = countInverstions(arr, si, mid);
        int right = countInverstions(arr, mid + 1, ei);

        int merge = merge(arr, si, mid, ei);

        return left + right + merge;
    }

    public static int merge(int[] arr, int si, int mid, int ei){
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid;

        int k = 0;
        int inversion = 0;
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                j++;
                i++;

                //both arrays are already sorted if left[i] > right[j]
                // then left[i], left[i+1], ..., left[mid] these also are greater 
                inversion += (mid - i + 1);
            }
        }

        while(i <= mid){
            temp[k] = arr[i];
                i++;
                k++;
        }

        while(j <= ei){
            temp[k] = arr[j];
                j++;
                k++;
        }
        for(int idx = 0; idx < temp.length; idx++){
            arr[si+idx] = temp[idx];
        }

        return inversion;

    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};

        int ans = countInverstions(arr, 0, arr.length - 1);

          System.out.print(ans);
    
        
    }
}
