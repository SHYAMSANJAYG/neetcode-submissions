class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,nums3,0,nums1.length);
        System.arraycopy(nums2,0,nums3,nums1.length,nums2.length);
        Arrays.sort(nums3);
        int n = nums3.length;
        int mid = nums3.length/2;
        if(n%2==0){
            return(nums3[mid-1]+nums3[mid])/2.0;
        }
        return nums3[mid];
    }
}