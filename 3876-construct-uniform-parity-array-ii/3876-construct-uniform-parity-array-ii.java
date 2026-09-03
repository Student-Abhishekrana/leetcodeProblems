class Solution {
    public boolean uniformArray(int[] nums1) {
        int n =nums1.length;
        Arrays.sort(nums1);
        int oe =0;
        if(nums1[0] % 2==0){
            oe =0;
        }else{
            oe =1;
        }
        int prev =nums1[0];

        for(int i=1; i<n; i++){
            if(nums1[i]%2 == oe){
                prev =nums1[i];
            }
            if(nums1[i]%2 != oe){
                prev =nums1[i]-prev;
            }
            if((prev % 2) != oe){
                return false;
            }
        }
        return true;

    }
}