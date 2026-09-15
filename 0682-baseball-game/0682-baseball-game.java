class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list =new ArrayList<>();

        for(String op :operations){
           if(op.equals("C")){
            list.remove(list.get(list.size()-1));
           }else if(op.equals("D")){
            list.add(list.get(list.size()-1)*2);
           }else if(op.equals("+")){
            list.add(list.get(list.size()-1)+list.get(list.size()-2));
           }else{
            list.add(Integer.parseInt(op));
           }
        }
        int total_sum =0;

        for(Integer num :list){
            total_sum +=num;
        }
        return total_sum;

    }
}