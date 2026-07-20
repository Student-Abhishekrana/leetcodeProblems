class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
     
      int [] ans =new int[m+n];

      int k=0;
      int i=0, j=0;
      while(i<m && j<n){
        if(nums1[i]<= nums2[j]){
            ans[k++] =nums1[i];
            i++;
        }else{
            ans[k++] =nums2[j];
            j++;
        }
      }

      while(i<m){
        ans[k++] =nums1[i++];
      }
      while(j<n){
        ans[k++] =nums2[j++];
      }
      
      int p=0;
      while(ans.length >p){
        nums1[p] =ans[p];
        p++;

      }

    }
}