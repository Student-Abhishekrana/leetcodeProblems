class Solution {
    public int maxArea(int[] height) {
        int left=0, right =height.length-1;

        int maxWater=Integer.MIN_VALUE;

        while(left < right){
            int water =0;
            int minheight =Math.min(height[left],height[right]);
            water =minheight*(right-left);

            if(maxWater < water){
                maxWater=water;
            }
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
           
        }
        return maxWater;
    }
}