class NumArray {
    int[] nums;
    int[] seg;
    public NumArray(int[] nums) {
        this.nums = nums;
        seg = new int[4 * nums.length];
        build(0,nums.length - 1,0);
    }
    private void build(int l,int r,int idx){
        if(l == r){
            seg[idx] = nums[l];
            return;
        }
        int mid = l + (r - l) / 2;
        build(l,mid,2 *idx + 1);
        build(mid+1,r, 2 * idx + 2);
        seg[idx] = seg[2 * idx + 1] + seg[2 * idx + 2];
    }
    public void update(int index, int val) {
        updatee(0,nums.length-1,index,val,0);
    }
    public int sumRange(int left, int right) {
        return query(0,nums.length -1,left,right,0);
    }
    private void updatee(int l , int r,int index, int val,int idx){
        if(l == r){
            seg[idx] = val;
            return;
        }
        int mid = l + (r - l) / 2;
        if(index <= mid){
            updatee(l,mid,index,val,2 * idx +1);
        }else{
            updatee(mid+1,r,index,val,2 * idx + 2);
        }
        seg[idx] = seg[2 * idx + 1] + seg[2 * idx + 2];
    }
    private int query(int l, int r,int ql, int qr,int idx){
        if(r < ql || l > qr) return 0;
        if(ql <= l && r <= qr) return seg[idx];
        int mid = l + (r -l) / 2;
        int left = query(l,mid,ql,qr,2 * idx +1);
        int right = query(mid+1,r,ql,qr,2 * idx + 2);
        return left + right;
    }
}
