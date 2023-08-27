class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        ArrayList<Integer> squares = new ArrayList<>();
        for(int[] arr : rectangles){
            squares.add(Math.min(arr[0] , arr[1]));
        }

        Collections.sort(squares);
        int count = 0;
        int max = squares.get(squares.size()-1);
        for(int i = 0 ; i < squares.size(); i++){
            if(squares.get(i) == max){
                count++;
            }
        }

        return count;
    }
}