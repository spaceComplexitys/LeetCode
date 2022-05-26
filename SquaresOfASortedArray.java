import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        SquaresOfASortedArray squares = new SquaresOfASortedArray();
    //    int[] input = {-4,-1,0,3,10};
        int[] input = {7,-3,2,3,11};
        squares.sortedSquares(input);

    }

    public int[] sortedSquares(int[] nums) {
        // For every iteration squre the value
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // then sort the array
        Arrays.sort(nums);

        return nums;
    }

}
