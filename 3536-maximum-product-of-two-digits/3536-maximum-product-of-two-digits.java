class Solution {
    public int maxProduct(int n) {
  
       ArrayList<Integer> arr =new ArrayList<>();
     
        while(n> 0){
           int lastDigit = n%10;
           arr.add(lastDigit);
            n /=10;
        }
        Collections.sort(arr);
        Integer[] result =new Integer[arr.size()];

        for(int i=0; i<result.length; i++){
                result[i] =arr.get(i);
        }
        int sz=result.length-1;

        
        return result[sz]*result[sz-1];
        
    }
}