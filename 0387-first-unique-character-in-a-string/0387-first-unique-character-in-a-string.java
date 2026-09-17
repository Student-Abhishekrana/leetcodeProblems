class Solution {
    public int firstUniqChar(String s) {
       HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int count =map.containsKey(ch)?map.get(ch):0;
            map.put(ch,count+1);

        }

        for(int i=0; i<s.length(); i++){
             char ch = s.charAt(i);
            if(map.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
}