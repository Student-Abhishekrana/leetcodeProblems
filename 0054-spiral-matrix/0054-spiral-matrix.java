class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
        int endRow = matrix.length - 1;
        ArrayList<Integer> ans = new ArrayList<>();
        if (matrix.length <= 0) {
            return ans;
        }

        while (startRow <= endRow && startCol <= endCol) {
            //top
            for (int col = startCol; col <= endCol; col++) {
                ans.add(matrix[startRow][col]);
            }
            //right
            for (int row = startRow + 1; row <= endRow; row++) {
                ans.add(matrix[row][endCol]);
            }
            //bottom
            if (startRow < endRow) {
                for (int col = endCol - 1; col >= startCol; col--) {
                    ans.add(matrix[endRow][col]);
                }
            }

            //left
            if (startCol < endCol) {
                for (int row = endRow - 1; row > startRow; row--) {
                    ans.add(matrix[row][startCol]);
                }
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return ans;
    }
}