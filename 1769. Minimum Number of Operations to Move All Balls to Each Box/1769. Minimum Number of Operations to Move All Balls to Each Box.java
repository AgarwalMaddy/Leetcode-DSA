class Solution {
    public int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];
        for(int i = 0 ; i < boxes.length(); i++){
            int steps = 0;
            for(int j = 0 ; j < boxes.length(); j++){
                if(boxes.charAt(j) == '1'){
                    steps += Math.abs(j - i);
                }
            }
            result[i] = steps;
        }

        return result;
    }
}