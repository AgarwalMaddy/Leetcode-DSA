class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combined = new int[nums1.length + nums2.length];
        for(int i = 0 ; i < nums1.length ; i++){
            combined[i] = nums1[i];
        }
        for(int i = nums1.length; i < (nums1.length + nums2.length) ; i++){
            combined[i] = nums2[i - nums1.length];
        }
        
        Arrays.sort(combined);
        int n = combined.length;
        double median;
        if(n % 2 != 0){
            median = combined[n/2];
        } else {
            median = (double)(combined[n/2] + combined[(n/2) - 1]) / 2;
        }
        
        return median;
    }
}