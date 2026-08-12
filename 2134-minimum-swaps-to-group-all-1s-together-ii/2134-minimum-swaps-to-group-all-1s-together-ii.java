class Solution {
    public int minSwaps(int[] nums) {
       int totalOnes =0;
       for(int x :nums){if(x==1){
        totalOnes++;
       }} 

       //int minSwap1;
       
       int maxOnes =calculateMin(nums,totalOnes, 1);

       return totalOnes- maxOnes;

    }

    private int calculateMin(int [] nums, int windowsize, int badValue){
        int currentOnes=0;
int n =nums.length;
        for(int i=0; i<windowsize; i++){
            if(nums[i]==badValue){
                currentOnes++;
            }
        }

        int maxOne =currentOnes;
      

        //sliding_Window
        for(int i=windowsize; i<nums.length+n-1; i++){
            //remove the previous element
            if(nums[(i-windowsize)%n]==badValue){
                currentOnes--;
            }
            if(nums[i%n]==badValue){
                currentOnes++;
            }

            maxOne =Math.max(maxOne,currentOnes);
        }
        return maxOne;

    }
}