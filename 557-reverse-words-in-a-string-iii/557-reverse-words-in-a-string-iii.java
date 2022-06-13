class Solution {
     public String reverseWords(String s) {
        String[] splitWords = s.split(" ");
        String solution = "";
        for (int i = 0; i < splitWords.length; i++) {
            StringBuilder reversed = new StringBuilder(splitWords[i]);
            reversed.reverse();
            solution += reversed;
            if (i != splitWords.length-1) {
                solution += " ";
            }
        }
        return solution;
    }
}