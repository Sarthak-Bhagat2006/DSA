class CountingSort{
    //T.C 0(N+M) where size N is size of arr and M is size of freq
    public static int[] sort(int[] arr){
        int n = arr.length;
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            max = Math.max(max, arr[i]);
        }

        int freq[] = new int[max+1];

        for(int i = 0; i < n; i++){
            freq[arr[i]]++;
        }
        int idx = 0;
        for(int i = 0; i < max+1; i++){
            while(freq[i] > 0){
                arr[idx] = i;
                idx++;
                freq[i] --;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        int[] sorted = sort(arr);

        for(int i = 0; i < sorted.length; i++){
            System.out.print(sorted[i] + " ");
        }
    }
}