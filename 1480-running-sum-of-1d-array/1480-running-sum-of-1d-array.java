// class Solution {
//     public int[] runningSum(int[] nums) {
//         for (int i = 0; i < nums.length-1; i++) {
//             int tempRunningSum = nums[i] + nums[i+1];
//             nums[i+1] = tempRunningSum;
//         }

//         return nums;
//     }
// }

class Solution {
    public int[] runningSum(int[] nums) {
            int i = 1;
            while (i<nums.length){
                nums[i]+=nums[i-1];
                i++;
            }
        return nums;
    }
}