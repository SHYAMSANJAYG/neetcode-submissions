class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum = 0;
        int max = nums[0];
        for(int i = 0;i<nums.length;i++){
            currentsum+=nums[i];
            if(currentsum>=max){
                max=currentsum;
            }
            if(currentsum<0){
                currentsum = 0;
            }
        }
        return max;
        
    }
}