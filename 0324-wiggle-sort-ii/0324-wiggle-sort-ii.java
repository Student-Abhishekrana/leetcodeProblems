class Solution {
    public void wiggleSort(int[] nums) {
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        for(int num :nums){
            pq.add(num);
        }

        for(int i=1; i<nums.length; i=i+2){
            nums[i] =pq.poll();
            
        }
        for(int i=0; i<nums.length; i=i+2){
            nums[i] =pq.poll();
        }


    }
}