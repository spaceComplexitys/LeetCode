import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates.removeDuplicates(nums));
    }

    // have a counter that increments after removed
    // loop through each element while having one element pointed
    // if there is duplicate replace the element with _ then increment counter
//    public int removeDuplicates(int[] nums) {
//        int numberOfDuplicates = 0;
//
//        ArrayList<Integer> something = new ArrayList<Integer>();
//
//        int currentPointer;
//        currentPointer = nums[0];
//        something.add(currentPointer);
//        for (int i = 0; i < nums.length; i++) {
//            if (currentPointer < nums[i]) {
//                currentPointer = nums[i];
//                something.add(currentPointer);
//            }
//        }
//
//        nums = something.stream().mapToInt(k->k).toArray();
//        System.out.println(Arrays.toString(nums));
//
//        return something.size();
//
//    }

    // The first occurence of any element will be unique, hence initialising the variable 'pos' with a value of 1. The next step is to iterate the array and compare 'i-th' place element with 'i+1-th' place element. If they are not unique we can place the new element found at the 'pos-th' index. We are incrementing 'pos' so that we can place the next unique element encountered at the 'pos+1-th' index from that point.
    //
    //If we were not to move the elements in-place, another naive solution could have been to use Set collections in java as sets do not allow duplicates.

    public int removeDuplicates(int[] nums) {

        int pos=1;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[pos++]=nums[i+1];
            }
        }
        return pos;
    }

}
