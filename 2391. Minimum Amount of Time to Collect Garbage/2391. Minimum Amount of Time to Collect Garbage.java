class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        boolean mType = false , pType = false , gType = false;
        int totalTime = 0;
        for(int i : travel){
            totalTime += 3 * i;
        }

        for(String s : garbage){
            totalTime += s.length();
        }

        int n = garbage.length;
        for(int i = n - 1; i > 0 ; i--){
            if(!garbage[i].contains("M")){
                totalTime -= travel[i-1];
            }else{
                break;
            }
        }
        for(int i = n - 1; i > 0 ; i--){
            if(!garbage[i].contains("P")){
                totalTime -= travel[i-1];
            }else{
                break;
            }
        }
        for(int i = n - 1; i > 0 ; i--){
            if(!garbage[i].contains("G")){
                totalTime -= travel[i-1];
            }else{
                break;
            }
        }

        return totalTime;
    }
}