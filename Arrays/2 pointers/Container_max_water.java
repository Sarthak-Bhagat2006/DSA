class Container_max_water{
    public static int maxArea(int[] heights){
        int n = heights.length;

        int l = 0;
        int r = n -1 ;

        int minHeight = Integer.MAX_VALUE;
        while(l < r){
            if(heights[l] > heights[r]){
                minHeight = heights[r];
                maxWater = Math.max(maxWater,  heights[r] * (r - l));
                r--;
            }else{
                minHeight = heights[l];
                maxWater = Math.max(maxWater,  heights[l] * (r - l));
                l++;
            }
        }

        return maxWater;
    }
    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.print(maxArea(heights));
    }
}