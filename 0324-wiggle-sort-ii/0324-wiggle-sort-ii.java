class Solution {
    public void wiggleSort(int[] nums) {
        int end =nums.length-1;

        int[] copy =Arrays.copyOf(nums,nums.length);
        Arrays.sort(copy);
        

        for(int i=1; i<nums.length; i=i+2){
            nums[i]=copy[end--];
            
        }
        for(int i=0; i<nums.length; i=i+2){
            nums[i] =copy[end--];
        }


    }
}