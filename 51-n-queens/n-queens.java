class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ll = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        nQueens(board,ll,0);
        return ll;
    }
    public void nQueens(char[][] board,List<List<String>> ll,int row){
        int n = board.length;
        if(row == n){
            List<String> str = new ArrayList<>();
            
            for(int i=0;i<n;i++){
                String s = "";
                for(int j=0; j < n; j++){
                    s += board[i][j];
                }
                str.add(s);
            }
            ll.add(str);
            return;
        }
        for(int j = 0; j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueens(board,ll,row+1);
                board[row][j] = '.'; //backtrack
            }
        }
    }
    public boolean isSafe(char[][] board,int row,int col){
        int n = board.length;
        //East >------> West
        for(int i=0;i<n;i++){
            if(board[row][i] == 'Q') return false;
        }
        //Nort > --- >
        for(int i=0;i<n;i++){
            if(board[i][col] == 'Q') return false;
        }
        //South East > ---- >
        int i =row, j = col;
        while(i < n && j < n){
            if(board[i][j] == 'Q') return false;
            i++;
            j++;
        }
        //North West >---->
        i =row; j=col;
        while(i >= 0 && j >= 0){
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }
        //South West > ---- > 
        i =row; j = col;
        while(i < n && j >=  0){
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }
        //North East >------>
        i=row; j = col;
        while(i >= 0 && j< n){
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }
        return true;
    }
}