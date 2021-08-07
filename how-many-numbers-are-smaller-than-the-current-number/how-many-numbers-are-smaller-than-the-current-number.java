class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int counter;
        int[] arr = new int[nums.length];
        for(int i = 0; i<nums.length;i++){
            counter = 0;
            for(int j = 0; j<nums.length;j++){
                if(i != j){
                    if(nums[i] > nums[j]){
                        counter++;
                    }
                }
            }
            arr[i]=counter;
        }
        return arr;
    }
}