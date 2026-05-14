//Apply search on rotated sorted array

class BinarySearchII{
    public static int binarySearch(int[] nums, int target){
        int n = nums.length;

        int l = 0;
        int r = n - 1;

        while(l <= r){
            int mid = (l + r) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[l] <= nums[mid]){
                if(target >= nums[l] && target <= nums[mid]){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }
            else{
                if(target >= nums[mid+1] && target <= nums[r]){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums= {8,10,11,3,6};
        int target = 6;

        int idx = binarySearch(nums, target);
        System.out.println(idx);
    }
}