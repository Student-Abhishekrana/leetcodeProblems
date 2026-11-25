class Solution {
    public boolean isPalindrome(String s) {
     String newStr =s.replaceAll("[^A-Za-z0-9]","").toLowerCase(); 

     int left =0, right =newStr.length()-1;

     while(left<=right){
        if(newStr.charAt(left)!= newStr.charAt(right)){
            return false;
        }
        left++;
        right--;
     }  
     return true;
    }
}