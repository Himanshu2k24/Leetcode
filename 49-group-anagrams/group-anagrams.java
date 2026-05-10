class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> has = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);

            has.putIfAbsent(s,new ArrayList<>());
            has.get(s).add(str);
        }
        return new ArrayList<>(has.values());
    }
}