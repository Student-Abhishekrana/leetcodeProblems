
class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
       

        int minValue = Integer.MAX_VALUE;
        int indexOfMinValue = 0;

        int maxVAlue = Integer.MIN_VALUE;
        int indexOfMaxValue = 0;

        //calculate the minValue & MaxValue with their index;

        for (int i = 0; i < n; i++) {
            if (minValue > nums[i]) {
                minValue = nums[i];
                indexOfMinValue = i;
            }
            if (maxVAlue < nums[i]) {
                maxVAlue = nums[i];
                indexOfMaxValue = i;
            }

        }
        //calculate min & max index
        int minIndex = Math.min(indexOfMinValue, indexOfMaxValue);
        int maxIndex = Math.max(indexOfMaxValue, indexOfMinValue);

        //calculation of min and max value
int removeFromFront =maxIndex+1;
int removeFromBack =(n-minIndex);
int removeFromEachSide = (minIndex+1)+(n-maxIndex);
        return Math.min(removeFromFront,Math.min(removeFromBack,removeFromEachSide));
    }
}