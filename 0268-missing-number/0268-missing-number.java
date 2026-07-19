class Solution {
    public int missingNumber(int[] nums) {
     int missingCounter =0;
     Arrays.sort(nums);
     for(int i=0; i<nums.length; i++){
        if(missingCounter==nums[i]){
            missingCounter++;
        }
     }
     return missingCounter;

    }
}