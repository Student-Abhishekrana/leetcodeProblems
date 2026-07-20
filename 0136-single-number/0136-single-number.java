class Solution {
    public int singleNumber(int[] nums) {
        int missingSingleNumber =0;
        for(int i=0; i<nums.length; i++){
            missingSingleNumber ^=nums[i];
        }
        return missingSingleNumber;
    }
}