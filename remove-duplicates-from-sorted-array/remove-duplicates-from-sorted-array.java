class Solution {
    public int removeDuplicates(int[] nums) {
        // {1, 2, 2}
        int pos=1;
        // loop through the array
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[pos++] = nums[i+1];
            }
        }

        return pos;
    }

}