class Solution {
    public int arraySign(int[] nums) {
       Arrays.sort(nums);
       int count_sign =0;

       for(int num :nums){
        if(num==0){
            return 0;
        }else if(num <0){
            count_sign++;
        }
       }
       return count_sign %2 ==0? 1:-1;
    }
}