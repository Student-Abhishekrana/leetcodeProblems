class Solution {
    List<List<String>> result =new ArrayList<>();
    public List<List<String>> partition(String s) {
        result =new ArrayList<>();
        List<String> list =new ArrayList<>();
        backTracking(0,s,list);
        return result;
    }
    private void backTracking(int start, String s,List<String>list){
        if(start>=s.length()){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int end =start+1; end<=s.length(); end++){
            String sub =s.substring(start,end);
            if(palindrome(sub)){
                list.add(sub);
            backTracking(end,s,list);
            list.remove(list.size()-1);
            }
        }

    }
    private boolean palindrome(String sub)
    {
        int i=0, j=sub.length()-1;
        while(i<j){
            if(sub.charAt(i)!= sub.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}