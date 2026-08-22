class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
       int gm = 1;
        for(int j = 0;j<nums.length;j++ ){
            for(int i = 0;i<=j;i++){
                if(nums[i]<nums[j]){
                    dp[j] = Math.max(dp[j],1+dp[i]);
                }
            }
            gm = Math.max(dp[j],gm);

        }
        return gm;
        
    }
}