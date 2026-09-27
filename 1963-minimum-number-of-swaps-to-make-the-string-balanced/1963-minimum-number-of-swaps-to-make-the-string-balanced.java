class Solution {
    public int minSwaps(String s) {
        char arr[] = s.toCharArray();

        int size=0;
        for(char ch :arr){
            if(ch=='['){
                size++;
            }else if(size>0){
                size--;
            }
        }
        return (size+1)/2;
    }
}