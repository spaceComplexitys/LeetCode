class Solution {
   public int searchInsert(int[] A, int target) {
        int left = 0;
        int right = A.length-1;
        int mid = 0;
        while (left <= right) {
            mid = left + ((right - left) / 2);
            if (A[mid] == target) {
                return mid;
            } else if (target < A[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}