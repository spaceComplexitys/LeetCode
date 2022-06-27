class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashSet = new HashSet<>();
        int[] bigArray;
        int[] smallArray;

        if (nums1.length > nums2.length) {
            bigArray = nums1;
            smallArray = nums2;
        } else {
            bigArray = nums2;
            smallArray = nums1;
        }

        for (int i = 0; i < smallArray.length; i++) {
            for (int j = 0; j < bigArray.length; j++) {
                if (smallArray[i] == bigArray[j]) {
                    hashSet.add(smallArray[i]);
                }
            }
        }



        int[] primitive = hashSet.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(primitive));

        return primitive;
    }
}