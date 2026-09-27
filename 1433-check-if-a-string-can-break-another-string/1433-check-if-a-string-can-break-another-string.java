class Solution {

    public boolean checkIfCanBreak(String s1, String s2) {
        int n =s1.length();
        int m =s2.length();
        if(n>m){
            return checkIfCanBreak(s2,s1);
        }
        char ch[] =s1.toCharArray();
        char ch2[] =s2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        
        boolean s1CanBreak =true;
        boolean s2CanBreak =true;
        for(int i=0; i<n; i++){
            if(ch[i]> ch2[i]){
                s1CanBreak= false;
            }
            if(ch2[i] > ch[i]){
                s2CanBreak =false;
            }
        }
        if(s1CanBreak || s2CanBreak){
            return true;
        }
        return false;
    }
}