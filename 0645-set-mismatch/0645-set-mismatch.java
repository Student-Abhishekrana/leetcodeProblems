class Solution {
    public int[] findErrorNums(int[] nums) {
        int result[] =new int[2];

        HashSet<Integer> set =new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                result[0] =nums[i];
            }
            set.add(nums[i]);
        }

        for(int i=1; i<=nums.length; i++){
            if(!set.contains(i)){
                result[1] =i;
            }
        }
        return result;
    }
}