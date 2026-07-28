class Solution {
    public String smallestPalindrome(String s) {
        
        int n =s.length();
        if(n < 2){
            return s;
        }

       String str =s.substring(0,n/2);

       char[] ch =str.toCharArray();

       Arrays.sort(ch);

       String firstHalf = new String(ch);

       StringBuilder result =new StringBuilder();

       result.append(firstHalf);


       if((n&1)==1){
            result.append(s.charAt(n/2));
       } 
       result.append(new StringBuilder(firstHalf).reverse());

       return result.toString();


    }
}