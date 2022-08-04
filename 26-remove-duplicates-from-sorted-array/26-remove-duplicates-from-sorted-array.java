class Solution {
    
    // Two Pointers solution 
    // i is the slow-runner while j is the fast-runner
    
    // nums[j] != nums[i] the duplicate run ended
    // save the value of nums[i+1]
    
    
    // public int removeDuplicates(int[] nums) {
    // if (nums.length == 0) return 0;
    // int i = 0;
    // for (int j = 1; j < nums.length; j++) {
    //     if (nums[j] != nums[i]) {
    //         i++;
    //         nums[i] = nums[j];
    //     }
    // }
    //     return i + 1;
    // }
    
    //Time complextiy : O(n). Assume that nn is the length of array. Each of ii and jj traverses at most nn steps.

    // Space complexity : O(1).  No new memory
    
    
    public int removeDuplicates(int[] nums) {
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