class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total = 0;
        for(int i =0; i<apple.length;i++){
            total += apple[i];
        }
        Arrays.sort(capacity);
        int totalC =0;
        int count =0;
        for(int i=capacity.length - 1;i>=0;i--){
            totalC += capacity[i];
            count++;
            if(totalC >= total) return count;
        }
        return 1;
    }
}