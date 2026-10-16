class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int currsum = nums[0];

        for (int start = 1; start < nums.length; start++) {
            currsum = Math.max(nums[start], currsum + nums[start]);
            maxsum = Math.max(maxsum, currsum);
            if(currsum<0){
                currsum=0;
            }
        
    }
    return maxsum;
}
}