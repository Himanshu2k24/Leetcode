class Solution {
    public int calPoints(String[] operations) {
        int result = 0;

        ArrayList<Integer> arr= new ArrayList<>();
        for(int i = 0; i<operations.length; i++){
            if(operations[i].equals("C")){
                arr.remove(arr.size()-1);

            }else if(operations[i].equals("D")){
                arr.add( 2 * arr.get(arr.size() -1));
            }
            else if(operations[i].equals("+")){
                arr.add(arr.get(arr.size()-1) + arr.get(arr.size()-2));
            }else{
                arr.add(Integer.valueOf(operations[i]));
            }
        }
        for(int num : arr){
            result += num;
        }
        return result;
    }
}