class Solution {
    public int findPeakElement(int[] nums) {
        int max = 0;
        int maxIndex = 0;
        
        if (nums.length > 0) {
            max = nums[0];
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                maxIndex = i;
                max = nums[i];
            }
        }
        
        return maxIndex;
    }
}