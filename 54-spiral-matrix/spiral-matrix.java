class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr =new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        
        int top = 0;
        int buttom = m-1;
        int left = 0;
        int right = n-1;
        while(top <= buttom && left <= right){
            //left ---- Right
            for(int i =left;i<=right;i++){
                arr.add(matrix[top][i]);
            }
            top++;
            //Top ---- Down
            for(int i =top; i<=buttom;i++){
                arr.add(matrix[i][right]);
            }
            right--;
            if(top <= buttom){
                //Right  --- Left
                for(int i = right;i>=left;i--){
                    arr.add(matrix[buttom][i]);
                }
                buttom--;
            }
            
            //Buttom ----Top
            if(left <= right){
                for(int i=buttom;i>=top;i--){
                arr.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        return arr;
    }
}