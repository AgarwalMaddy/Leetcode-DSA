class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int distanceX = Math.abs(sx - fx);
        int distanceY = Math.abs(sy - fy);

        int min = Math.min(distanceX , distanceY) + Math.abs(distanceY - distanceX);

        if(min == 0){
            if(t == 1){
                return false;
            }
            return true;
        }


        return t >= min;
    }
}