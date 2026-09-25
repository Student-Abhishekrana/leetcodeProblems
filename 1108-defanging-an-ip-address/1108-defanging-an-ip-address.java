class Solution {
    public String defangIPaddr(String address) {
        StringBuilder replacedString =new StringBuilder("");

        for(int i =0; i<address.length(); i++){
            char curr =address.charAt(i);
            if(curr == '.'){
                replacedString.append("[.]");
            }else{
                replacedString.append(curr);
            }
        }
        return replacedString.toString();
    }
}