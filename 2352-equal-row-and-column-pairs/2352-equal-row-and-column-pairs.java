class Solution {
    public int equalPairs(int[][] grid) {
        //create a trnaspose matrix
        int row =grid.length;
        int col =grid[0].length;
        int[][] tran_grid =new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                tran_grid[i][j] =grid[j][i];
            }
        }

        int count=0;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(Arrays.equals(grid[i],tran_grid[j])){
                    count++;
                }
            }
        }
        return count;


    }
}