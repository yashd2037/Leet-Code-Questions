class Solution {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        int x = 0;
        for(int i = 0; i<nums.length;i++){
            
            x = x + nums[i];
            sums[i]=x;
 
        }
    return sums;
    }
}