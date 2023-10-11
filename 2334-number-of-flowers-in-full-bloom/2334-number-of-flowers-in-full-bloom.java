class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] persons) {
        int p = persons.length;
        int f = flowers.length;
        int[] start = new int[f];
        int[] end = new int[f];

        for(int i = 0 ; i < f ; i++){
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int[] numberOfBlooms = new int[p];
        for(int i = 0 ; i < p ; i++){
            int sBloom = binarySearch(start , persons[i] + 1);
            int eBloom = binarySearch(end , persons[i]);
            numberOfBlooms[i] = sBloom - eBloom;
        }

        return numberOfBlooms;
    }

    public int binarySearch(int[] arr , int target){
        int left = 0;
        int right = arr.length - 1;
        int result = arr.length;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] >= target){
                result = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return result;
    }
}