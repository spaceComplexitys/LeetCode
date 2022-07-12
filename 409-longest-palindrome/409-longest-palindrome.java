class Solution {
     public int longestPalindrome(String s) {
        // base case
        if (s.length() == 1) {
            return 1;
        }
            Set<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (set.contains(c)) set.remove(c);
                else set.add(c);
            }

            int odd = set.size();
            return s.length() - (odd == 0 ? 0 : odd - 1);
    }
}