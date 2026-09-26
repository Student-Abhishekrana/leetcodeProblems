class Solution {
    public boolean judgeSquareSum(int c) {
        if(c<0){
            return false;
        }
        int start=0;
        long end = (long) Math.sqrt(c);

        while(start<=end){
            long sum =start*start + end*end;
            if(sum==c){
                return true;
            }else if(sum < c){
                start++;
                
            }else{
                end--;
            }
        }
        return false;
    }
}