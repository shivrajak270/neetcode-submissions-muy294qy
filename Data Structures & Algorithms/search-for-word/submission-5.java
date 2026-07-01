class Solution {

    public boolean exist(char[][]board,String word,int i,int j,int index){
        if(i<0 || j<0 || i>board.length-1 || j>board[0].length-1 || board[i][j]=='*'|| board[i][j]!=word.charAt(index))
          return false;

          if(index==word.length()-1)
              return true;
        
          char vis=board[i][j];
          board[i][j]='*';

         boolean hh=exist(board,word,i-1,j,index+1)||
          exist(board,word,i+1,j,index+1)||
          exist(board,word,i,j-1,index+1)||
          exist(board,word,i,j+1,index+1);

                  board[i][j] = vis;

                  return hh;

        

    }


    public boolean exist(char[][] board, String word) {

        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(word.charAt(0)==board[i][j] && exist(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;

        
    }
}
