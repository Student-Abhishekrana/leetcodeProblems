class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int low =1;
        int high =Arrays.stream(nums).max().getAsInt();
        while(low < high){
            int mid =low +(high-low)/2;
            int operation =0;
            for(int num :nums){
                operation +=(num-1)/mid;
            }
            if(operation <= maxOperations){
                high =mid;
            }else{
                low =mid+1;
            }
        }
        return low;

    }
}