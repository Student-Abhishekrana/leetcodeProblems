class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        char[] a =new char[26]; 
        char[] b =new char[26];

        for(int i=0; i<word1.length(); i++){
            char ch =word1.charAt(i);
            a[ch-'a']++;
        } 
        for(int i=0; i<word2.length(); i++){
            char ch =word2.charAt(i);
            b[ch-'a']++;
        } 

        for(int i=0; i<26; i++)
        {
            if((a[i]==0 && b[i] != 0) || (a[i]) != 0 && b[i] == 0 ){
                return false;
            }
        }



        Arrays.sort(a);
    
        Arrays.sort(b);

        return (Arrays.equals(a,b));
    }
}