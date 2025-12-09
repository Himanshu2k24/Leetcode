class Solution {
    public int specialTriplets(int[] nums) {
        HashMap<Integer,Integer> mapLeft=new HashMap<>();
        HashMap<Integer,Integer> mapRight=new HashMap<>();
        int mod=1000000000+7;

        long count=0;
        for(int i=0;i<nums.length;i++){
            mapRight.put(nums[i],mapRight.getOrDefault(nums[i], 0) + 1);
        }

        for(int i=0;i<nums.length;i++){
            int freq=mapRight.get(nums[i])-1;
            if(freq==0){
                mapRight.remove(nums[i]);
            }else{
                mapRight.put(nums[i],freq);
            }
            int freqLeft=mapLeft.getOrDefault(2*nums[i],0);
            int freqRight=mapRight.getOrDefault(2*nums[i],0);

            count=(count+(long)freqLeft*freqRight) % mod;
            mapLeft.put(nums[i],mapLeft.getOrDefault(nums[i], 0) + 1);
            
        }
        return (int)count;
    }
}