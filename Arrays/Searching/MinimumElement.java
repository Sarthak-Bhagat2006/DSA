class MinimumElement{
    
    public static int minimumElemet(int[] nums){
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        while(l < r){
            int mid = (l + r) / 2;

            if(nums[mid] > nums[r]){
                l = mid + 1; //discard mid
            }else{ //nums[mid] < nums[l] 
                r = mid; //r can be ower answer
            }
        }
        return nums[r];
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,1};
        System.out.print(minimumElemet(nums));
    }
}