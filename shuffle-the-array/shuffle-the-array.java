class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] mix = new int[nums.length];
        if((nums.length%2)==0){
            int j = 1;
            for(int i = 0; i<n;i++){
                mix[i*2]=nums[i];
                mix[i+j]=nums[i+n];
                j++;
            }
        }
        return mix;
    }
}