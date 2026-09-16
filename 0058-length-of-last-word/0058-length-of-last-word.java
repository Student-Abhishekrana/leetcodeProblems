class Solution {
    public int lengthOfLastWord(String s) {
        s =s.trim();
        int lastspace =s.lastIndexOf(" ");
        return (s.length()-1)-lastspace;
    }
}