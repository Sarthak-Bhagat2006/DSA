//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

//A subarray is a contiguous non-empty sequence of elements within an array.


import java.util.*;

class SubarraySum{
    public static int solve(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>(); //storing prefixSum and occured index
        int n = nums.length;
        int prefixSum = 0;
        int maxLength = 0;
        map.put(0, -1);
        for(int i = 0; i < n; i++){
            prefixSum += nums[i];
            
            if(!map.containsKey(prefixSum)){
                map.put(prefixSum, i);
            }
            int rem = k - prefixSum;

            if(map.containsKey(rem)){
                maxLength = Math.max(maxLength, i - map.get(rem));
            }
        }
        return maxLength;
    } 
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        int ans = solve(nums, k);
        System.out.print(ans);
    }
}