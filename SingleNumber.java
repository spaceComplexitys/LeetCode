import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] input = {-1,-1,-2,-3,-2};
        singleNumber.singleNumber(input);
    }
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
        
        //^ returns 1 if the integers are different
//        HashMap<Integer, Integer> numbers = new HashMap<>();
//
//        for (int i = -9 ; i <= 9; i++) {
//            numbers.put(i, 0);
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            if (numbers.containsKey(nums[i])) {
//                count = numbers.get(nums[i]);
//                count+= 1;
//                numbers.put(nums[i], count);
//            }
//        }
//
//        for (int i = -9; i < numbers.size(); i++) {
//            if (numbers.get(i) == 1) {
//                return i;
//            }
//        }
//
//        return 0;
    }
}
