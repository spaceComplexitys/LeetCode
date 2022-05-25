import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] input = {3,2,2,3};
        System.out.println(removeElement.removeElement(input, 3));
//        int[] input = {0,1,2,2,3,0,4,2};
//        System.out.println(removeElement.removeElement(input, 2));
    }

    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i=0; i < length; i++) {
            if (nums[i] == val) {
                nums[i--] = nums[length-- -1];
            }
        }
        return length;
    }

//    public int removeElement(int[] nums, int val) {
//        int pos=0;
//        int amountRemoved = 0;
//        if (nums[0] == val) {
//            for(int i=0;i<=nums.length-1;i++){
//                if (i == nums.length-1) {
//                    if(nums[i] == val){
//                        nums[i]= val+1000;
//
//                        break;
//                    }
//                }
//                if (nums[i+1] == val) {
//                    nums[pos++] = nums[i+1];
//
//                } else {
//                    nums[pos++]=nums[i+1];
//                    amountRemoved++;
//                }
//            }
//
//            System.out.println(Arrays.toString(nums));
//
//            return amountRemoved;
//        } else {
//            for (int i=0; i<nums.length-1; i++){
//                if(nums[i] == val){
//                    nums[pos++]=nums[i+1];
//                    amountRemoved++;
//                } else {
//                    pos++;
//                }
//            }
//
//        }
//        System.out.println(Arrays.toString(nums));
//
//        return amountRemoved;
//    }
}
