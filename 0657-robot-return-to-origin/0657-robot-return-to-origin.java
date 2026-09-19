class Solution {
    public boolean judgeCircle(String moves) {
        int originX = 0;
        int originY = 0;
        for (int i = 0; i < moves.length(); i++) {
            char dir = moves.charAt(i);
            if (dir == 'L') {
                originX--;
            } else if (dir == 'D') {
                originY--;

            } else if (dir == 'U') {
                originY++;
            } else if (dir == 'R') {
                originX++;
            }

        }
        return (originX == 0 && originY==0);
    }
}