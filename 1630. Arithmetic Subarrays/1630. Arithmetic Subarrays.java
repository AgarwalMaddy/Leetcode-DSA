class Solution {
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();
        int m = l.length;
        for(int i = 0 ; i < m ; i++){
            if(r[i] - l[i] < 1){
                result.add(false);
            }else{
                ArrayList<Integer> temp = new ArrayList<>();

                for(int j= l[i] ; j <= r[i] ; j++){

                    temp.add(nums[j]);
                }

                if(isArithmetic(temp)){
                    result.add(true);
                }else{
                    result.add(false);
                }
            }
        }

        return result;
    }
    public static boolean isArithmetic(ArrayList<Integer> arr){
        Collections.sort(arr);
        int n = arr.size();
        int d = arr.get(1) - arr.get(0);
        int i = 1, j = 2;
        while(i < n && j < n){
            if(arr.get(j) - arr.get(i) != d){
                return false;
            }
            i++;
            j++;
        }

        return true;
    }
}
