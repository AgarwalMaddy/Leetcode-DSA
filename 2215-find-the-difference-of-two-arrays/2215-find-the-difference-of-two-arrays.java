class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         return Arrays.asList(getElementsInList(nums1, nums2), getElementsInList(nums2, nums1)); 
    }
    public List<Integer> getElementsInList(int[] nums1 , int[] nums2){
        HashSet<Integer> notDuplicate = new HashSet<>();
    
        for(int i : nums1){
            boolean exists = false;
            for(int j : nums2){
                if(j == i){
                    exists = true;
                    break;
                }
            }
            if(!exists){
                notDuplicate.add(i);
            }
        }
        
        return new ArrayList<>(notDuplicate);
    }
}