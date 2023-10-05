class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer , Integer> freqCount = new HashMap<>();
        for(int i : nums){
            freqCount.put(i , freqCount.getOrDefault(i , 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        int frequency = n/3;

        for(Map.Entry<Integer,Integer> entry : freqCount.entrySet()){
            int element = entry.getKey();
            int count = entry.getValue();

            if(count > frequency){
                result.add(element);
            }
        }

        return result;

    }
}