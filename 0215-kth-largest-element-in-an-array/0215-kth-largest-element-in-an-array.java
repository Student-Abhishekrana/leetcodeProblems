class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n =nums.length;
        PriorityQueue<Integer> heap =new PriorityQueue<>();
        for(int num :nums){
            heap.offer(num);
            if(heap.size()>k){
                heap.poll();
            }
        }

       
        return heap.peek();
    }
}