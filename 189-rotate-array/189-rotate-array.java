import java.util.ArrayList;
import java.util.Arrays;


class Solution {
     public void rotate(int[] nums, int k) {
        ArrayList<Integer> solution = new ArrayList<>();

        //Edge case what if index given is last digit of array
        // Edge case if there is only one element
         if (nums.length == 1) {
            solution.add(nums[0]);
        }
        else {
            if (k > nums.length) {
                k %= nums.length;
                for (int i = nums.length-k; i <= nums.length-1; i++) {
                    solution.add(nums[i]);
                }
                for (int j = 0; j < nums.length-k; j++) {
                    solution.add(nums[j]);
                }
            } else {
                // Think like last k element must go in front
                for (int i = nums.length - k; i <= nums.length - 1; i++) {
                    solution.add(nums[i]);
                }
                for (int j = 0; j < nums.length - k; j++) {
                    solution.add(nums[j]);
                }
            }
        }

        for (int i = 0; i < solution.size(); i++) {
            nums[i] = solution.get(i);
        }

      //  System.out.println(Arrays.toString(nums));
    }
}