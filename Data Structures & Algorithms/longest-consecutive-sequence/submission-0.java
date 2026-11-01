class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count;
        int maxcount=0;
        int currentsum;
        for(int num1: nums){
             set.add(num1);
             
        }
        for(int num: set){
            if(!set.contains(num-1)){
                count = 1;
                currentsum = num;
                while(set.contains(currentsum+1)){
                    count+=1;
                    currentsum+=1;
                }
                maxcount = Math.max(count,maxcount);
            }
        }

       return maxcount; 
    }
}