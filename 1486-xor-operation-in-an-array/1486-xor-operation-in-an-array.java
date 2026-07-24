class Solution {
    public int xorOperation(int n, int start) {
        int nums[] =new int[n];
        int i=0; 
        while(i<n){
            nums[i] =start+2*i;
            i++;
        }

        int result =0;

        for(int num :nums){
            result ^=num;
        }
        return result;
    }
}