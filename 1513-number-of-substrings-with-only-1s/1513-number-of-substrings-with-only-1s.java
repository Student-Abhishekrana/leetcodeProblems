class Solution {
    public int numSub(String s) {
        int n =s.length();
        long modulo =1000000007;
        long count =0;
        long ans =0;
        for(int i=0; i<n; i++){
            char c =s.charAt(i);
            if(c=='1'){
                count++;
            }else{
                long add =(count*(count+1))/2;
                ans=(ans+ add)%modulo; 
                count=0;
            }
        }
        long add =(count*(count+1))/2;
        ans = (ans+add)%modulo;
        return (int)ans;
    }
}