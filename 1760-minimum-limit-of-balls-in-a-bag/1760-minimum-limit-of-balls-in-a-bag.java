class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = 0;
        for (int num : nums) {
            if (num > right) {
                right = num;
            }
        }

       

        while (left < right) {
            int mid = left + (right - left) / 2;
            //is this mid valid
            int opr = 0;
            for (int num : nums) {
                opr += (num - 1) / mid;
            }
            if(opr <= maxOperations){
                right =mid;
            }else{
                left =mid+1;
            }
            
        }
        return left;


    }
}