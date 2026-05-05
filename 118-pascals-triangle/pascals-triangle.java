class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> result  =  new ArrayList<>();
        for(int i = 0; i < n;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0 ; j <=i; j++){
                if(j == 0 || j == i) temp.add(1);
                else{
                    int sum = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                    temp.add(sum);
                }
            }
            result.add(new ArrayList<>(temp));
        }
        return result;
    }
}