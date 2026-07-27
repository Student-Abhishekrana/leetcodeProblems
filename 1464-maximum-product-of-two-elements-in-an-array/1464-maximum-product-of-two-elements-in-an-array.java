class Solution {
    public int maxProduct(int[] nums) {
        
        PriorityQueue<Integer> pq =new PriorityQueue<>((a,b)->b-a);

        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }

        int max1 =pq.poll()-1;
        int max2 =pq.poll()-1;

        return max1*max2;

        

    }
}