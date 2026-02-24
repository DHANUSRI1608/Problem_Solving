class Solution {
    public void func(int[][] board,int total_row,int total_cols,int work_row,int work_col,int[][] dir,boolean[][] visited)
    {
        for(int i=0;i<dir.length;i++)
        {
            int cal_row = dir[i][0] + work_row;
            int cal_col = dir[i][1] + work_col;
           if(cal_row >= 0 && cal_row < total_row && cal_col >= 0 && cal_col < total_cols &&
   visited[cal_row][cal_col] == false && board[cal_row][cal_col] == 1)
            {
                visited[cal_row][cal_col]=true;
                func(board,total_row,total_cols,cal_row,cal_col,dir,visited);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int count=0;
        int m = grid.length;
        int n = grid[0].length;
        int dir[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        boolean visited[][] = new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && visited[i][j]==false)
                {
                    if(i==0 || j==0 || i==m-1 || j==n-1)
                     {
                        visited[i][j]=true;
                        func(grid,m,n,i,j,dir,visited);
                     }
                }
            }
        }
         for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && visited[i][j]==false)
                {
                    count++;
                }
            }
        }
        
        return count;
    }
}