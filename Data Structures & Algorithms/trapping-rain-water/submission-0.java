class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0] = 0;
        right[height.length-1] = 0;
        int lmax = height[0];
        int rmax = height[height.length-1];
        int gmax = 0;int lsum;
        for(int i = 1;i<height.length;i++){
            if(height[i]>lmax){
                lmax = height[i];    
            }
                left[i] = lmax;
        }
        for(int i = height.length-2;i>=0;i--){
            if(height[i]>rmax){
                rmax = height[i];
            }
            right[i] = rmax;
        }
       for(int i = 1;i<height.length;i++){
        lsum = Math.min(left[i],right[i])-height[i];
        if(lsum>0){
            gmax+=lsum;
        }
        else{
        }

     }
     return gmax;
    }
}