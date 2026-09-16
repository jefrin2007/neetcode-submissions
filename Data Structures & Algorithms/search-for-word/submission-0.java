class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j] == word.charAt(0)){
                    if(dfs(board,word,i,j,0)) return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,String word,int row,int col,int index){
        if(index == word.length()){
            return true; 
        }
        if(row<0 || row >= board.length || col<0 || col >= board[0].length){
            return false;
        }
        if(board[row][col] != word.charAt(index)){
            return false;
        }
        char temp = board[row][col];
        board[row][col] = '#';
        boolean up = dfs(board,word,row-1,col,index+1);
        boolean down = dfs(board,word,row+1,col,index+1);
        boolean left = dfs(board,word,row,col-1,index+1);
        boolean right = dfs(board,word,row,col+1,index+1);
        board[row][col] = temp;
        if(up == true ||down == true || left == true || right == true){
            return true;
        }
        return false;
    }
}
