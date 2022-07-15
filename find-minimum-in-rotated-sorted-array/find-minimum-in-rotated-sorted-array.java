class Solution {
    public int findMin(int[] nums) {
        int minNum = 0;

        if (nums.length > 0) {
            minNum = nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minNum) {
                minNum = nums[i];
            }
        }
        
        return minNum;

    }

}