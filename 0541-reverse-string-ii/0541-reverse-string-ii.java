class Solution {
    public String reverseStr(String s, int k) {
       int start=0;
       int end =Math.min(k,s.length());

       char[] arr =s.toCharArray();

       while(start <s.length()){
        reverse(arr,start,end);
        start =start +2*k;
        end =Math.min(start+k,s.length());
       }
       return new String(arr);
    }
    private static void reverse (char[] arr, int start, int end){
        while(start<end){
            char temp =arr[start];
            arr[start] =arr[end-1];
            arr[end-1] =temp;
            start++;
            end--;
        }
    }
}