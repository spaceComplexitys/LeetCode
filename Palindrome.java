class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(100011));
    }
    // Given an integer x, return true if x is palindrome integer.
    public boolean isPalindrome(int x) {
        // Turn it into a string
        // loop through the index
        // figure out if the 0th index and last index are the same

        String numIntoString = String.valueOf(x);

        String leftRight = numIntoString;
        String rightLeft = new StringBuilder(numIntoString).reverse().toString();

        if (leftRight.equals(rightLeft)) {
            return true;
        }

        return false;

    }



}