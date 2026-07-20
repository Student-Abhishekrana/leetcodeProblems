class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       
        int startingPoint =0;
        int endingPoint =arr.length-1;

        while(startingPoint < endingPoint){
            if(arr[startingPoint] > arr[endingPoint]){
                endingPoint--;
            }else{
                startingPoint++;
            }
        }
        return startingPoint;
    }
}