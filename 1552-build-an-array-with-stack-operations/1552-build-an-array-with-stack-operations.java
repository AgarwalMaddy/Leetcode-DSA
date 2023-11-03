class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> outputOperations = new ArrayList<>();
        int i = 0;
        for(int num : target){
            while(i < num - 1){
                outputOperations.add("Push");
                outputOperations.add("Pop");
                i++;
            }
            outputOperations.add("Push");
            i++;
        }

        return outputOperations;
    }
}