class Solution {
    public int minimumSum(int num) {
        int[] digitArray = new int[4];
        int i = 0;
        while(num > 0){
            digitArray[i++] = num % 10;
            num = num / 10;
        }
        
        Arrays.sort(digitArray);
        int new1 = digitArray[0] * 10 + digitArray[2];
        int new2 = digitArray[1] * 10 + digitArray[3];
        int minSum = new1 + new2;
        return minSum;
    }
}