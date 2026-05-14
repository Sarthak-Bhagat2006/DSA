class BinarySearch{
    public static int binarySearch(int[] nums, int target){
        int n = nums.length;

        int l = 0;
        int r = n - 1;

        while(l <= r){
            int mid = (l + r) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                l ++;
            }
            else{
                r --;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums= {3,6,8,10,11};
        int target = 8;

        int idx = binarySearch(nums, target);
        System.out.println(idx);
    }
}