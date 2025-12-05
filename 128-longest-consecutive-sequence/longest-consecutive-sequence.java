class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashSet<Integer> has = new HashSet<>();
        for(int num : nums){
            has.add(num);
        }
        for(int num : has){
            pq.add(num);
        }
        int a;
        int b = Integer.MIN_VALUE;
        int max = 1;
        int count = 0;
        while(!pq.isEmpty()){
            a  = pq.poll();
            if(a == b){
                count++;
                max = Math.max(max,count);
            }else{
                count = 1;
            }
            b = a +1;
             
        }
        return max;
    }
}