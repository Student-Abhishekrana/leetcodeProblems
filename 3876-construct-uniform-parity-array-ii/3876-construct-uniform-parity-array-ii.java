class Solution {
    public boolean uniformArray(int[] nums1) {
      int min =Integer.MAX_VALUE;
        for (int num : nums1) {
           min =Math.min(min,num);
        }

        //if min number is odd . then its possible to convert all number into odd
        if(min %2 !=0){
            return true;
        }else{
            //if min number is even , then its impossible to convert all number into even

            for(int num :nums1){
                if(num% 2 != 0){
                    return false;
                }
            } 
        }
        return true;

    }
}