class Solution {
    public void moveZeroes(int[] nums) {
    // if spots a zero move the elment to lect and zero to right. If at the end just put zero
        // Three cases
        // First: Zero is at the zeroth element and none
        // Second: zero is at the zeroth element and a number at the first element
        // Third: zero is at ith and number at the i+1 elemnt

        if (nums.length == 1) {
            if (nums[0] == 0) {
                return;
            }
        }

        int countZeros = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZeros++;
            }
        }

        int howManyTimesRan = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[howManyTimesRan] = nums[i];
                howManyTimesRan++;
            }
        }

        for (int i = 0; i < countZeros; i++) {
            nums[howManyTimesRan++] = 0;
        }


        return;
    }
}