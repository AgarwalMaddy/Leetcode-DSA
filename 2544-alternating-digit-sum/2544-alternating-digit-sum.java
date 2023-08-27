class Solution {
    public int alternateDigitSum(int n) {
        String num = Integer.toString(n);
        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            if(i % 2 == 0){
                int A = num.charAt(i) - '0';
                sum += A;
            } else {
                int A = ((num.charAt(i) - '0' )* -1);
                sum += A;
            }
        }
        
        return sum;
    }
}