class Solution {
    public int[] sortArray(int[] nums) {
       int curr,j;
       for(int i = 1;i<nums.length;i++){
         curr = nums[i];
         j = i-1;
         while(j>=0 && nums[j]>curr){
            nums[j+1] = nums[j];
            j--;
         }
       nums[j+1] = curr;
       }
        return nums;
    }
}