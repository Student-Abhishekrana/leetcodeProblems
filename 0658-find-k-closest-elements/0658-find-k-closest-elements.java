class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> minHeap =new PriorityQueue<>();

        for(int num :arr){
            if(k>0){
                minHeap.offer(num);
                k--;
            }
            else if(Math.abs(x-minHeap.peek()) > Math.abs(num-x)){
                minHeap.poll();
                minHeap.offer(num);
            }
        }

        List<Integer> ans =new ArrayList<>();
        
        while(!minHeap.isEmpty()){
            ans.add(minHeap.poll());
        }
        return ans;
    }
}