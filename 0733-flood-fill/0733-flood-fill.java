class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        int originalColour = image[sr][sc];
        if (originalColour != color) {

            helper(image, sr, sc, color, vis, originalColour);
        }
        return image;
    }

    private void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int originalColour) {

        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc]
                || image[sr][sc] != originalColour) {
            return;
        }

        vis[sr][sc]= true;
        image[sr][sc] =color;

        //left
        helper(image, sr, sc - 1, color, vis, originalColour);
        //right
        helper(image, sr, sc + 1, color, vis, originalColour);
        //up
        helper(image, sr - 1, sc, color, vis, originalColour);
        //down
        helper(image, sr + 1, sc, color, vis, originalColour);
    }
}