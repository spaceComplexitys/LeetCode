import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {

    /*
    * Input: nums = [1,2,3,4,5,6,7], k = 3
      Output: [5,6,7,1,2,3,4]
      Explanation:
      rotate 1 steps to the right: [7,1,2,3,4,5,6]
      rotate 2 steps to the right: [6,7,1,2,3,4,5]
      rotate 3 steps to the right: [5,6,7,1,2,3,4]
      *
      * Input: nums = [-1,-100,3,99], k = 2
        Output: [3,99,-1,-100]
        Explanation:
        rotate 1 steps to the right: [99,-1,-100,3]
        rotate 2 steps to the right: [3,99,-1,-100]
    */


    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
//        int[] input = {5,6,7,1,2,3,4};
//        rotateArray.rotate(input, 6);
//        int[] input = {1,2,3,4,5,6,7};
//        rotateArray.rotate(input, 3);
//        int[] input = {-1,-100,3,99};
//        rotateArray.rotate(input, 2);
//        int[] input = {1,2,3};
//        rotateArray.rotate(input, 5);
        int[] input = {1,2,3};
        rotateArray.rotate(input, 5);

    }

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

        System.out.println(Arrays.toString(nums));
    }

}

