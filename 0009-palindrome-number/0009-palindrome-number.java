class Solution {
    public boolean isPalindrome(int x) {
     int copy =x;
     int reverse =0;
     while(copy>0){
        int lastDigit =copy%10;
        reverse =reverse*10 +lastDigit;
        copy /=10;
     }

     return (x==reverse);

    }
}