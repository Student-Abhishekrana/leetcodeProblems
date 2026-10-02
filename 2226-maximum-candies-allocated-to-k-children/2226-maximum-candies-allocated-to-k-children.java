class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left =0;
        int right =0;
        for(int candy :candies){
            if(candy > right){
                right =candy;
            }
        }

        int ans =0;

        while(left < right){
            int mid =(right+1+left)/2;
            long count =0;
            for(int candy :candies){
                count +=candy/mid;
            }
            if(count >= k){
              
                left =mid;
            }else{
                right =mid-1;
            }
        }
        return left;
       
    }
}