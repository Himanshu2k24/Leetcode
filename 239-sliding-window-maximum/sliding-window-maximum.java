class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        if(n==0 || k==0) return new int[0];
        PriorityQueue<int[]> qu = new PriorityQueue<>(
            (a,b) -> b[0] - a[0]
        );
        for(int i=0;i<k;i++){ 
            qu.offer(new int[]{nums[i],i});
        }
        arr.add(qu.peek()[0]);

        for(int i=k;i<n;i++){
            qu.offer(new int[]{nums[i],i});
            while(qu.peek()[1] <= i -k ){
                qu.poll();
            }

            arr.add(qu.peek()[0]);
        }
        int idx =0;
        int[] newarr = new int[n-k +1];
        for(int num : arr){
            newarr[idx++] = num;
        }
        return newarr;
    }
    
}