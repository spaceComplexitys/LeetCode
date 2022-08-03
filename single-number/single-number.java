class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numberRepeats = new HashMap<>();

        int singleNumber = 0;

        for (int i = 0; i < nums.length; i++) {
            if (numberRepeats.containsKey(nums[i])) {
                numberRepeats.put(nums[i], numberRepeats.get(nums[i]) + 1);
            } else {
                numberRepeats.put(nums[i], 1);
            }

        }

        for (Map.Entry<Integer, Integer> entry : numberRepeats.entrySet()) {
            if (entry.getValue() == 1) {
                singleNumber = entry.getKey();
            }
        }

        return singleNumber;
    }
}