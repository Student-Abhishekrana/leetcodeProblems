class Solution {
    public int maxProduct(int[] nums) {

        int largest = nums[0];
        int secondLargest =Integer.MIN_VALUE;

        for (int i = 1; i <nums.length; i++) {
            if (largest < nums[i]) {
                secondLargest = largest;
                largest = nums[i];

            } else if (nums[i] <= largest && nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        int max1 = largest - 1;
        int max2 = secondLargest - 1;

        return max1 * max2;

    }
}