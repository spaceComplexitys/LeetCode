class Solution {
    public int maxSubArray(int[] nums) {

        if (nums.length <= 1) {
            return nums[0];
        }

        int curHighest = 0;
        int highest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            curHighest += nums[i];
            if (curHighest > highest) {
                highest = curHighest;
            }
            if (curHighest < 0) {
                curHighest = 0;
            }
        }


        return highest;
    }
}