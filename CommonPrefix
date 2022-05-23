public class CommonPrefix {
    public static void main(String[] args) {
        CommonPrefix commonPrefix = new CommonPrefix();
        String[] input = {"flower","flower","flower","flower"};//"a"};//"dog","racecar","car"};//"flower","flow","flight"};
        System.out.println(commonPrefix.longestCommonPrefix(input));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
    
//    // keep looping through until find a pattern and put a counter for each
//    public String longestCommonPrefix(String[] strs) {
//        int countHowManyTimes = 0;
//        String lettersInCommon = "";
//        int shortestLength = 0;
//        int timesCommon = 0;
//
//
//        if (strs.length == 1) {
//            return strs[0].toString();
//        }
//
//        //First figure out the length of the shortest string
//        shortestLength = strs[0].length();
//        for (int i = 0; i < strs.length; i++) {
//            if (strs[i].length() < shortestLength)
//                shortestLength = strs[i].length();
//        }
//
//        if (shortestLength > strs.length) {
//            for (int j = 0; j < shortestLength; j++) {
//                for (int i = 0; i < strs.length-1; i++) {
//
//                    for (int k = 0; k < shortestLength; k++) {
//                        if (strs[i].charAt(j) == strs[i+1].charAt(j)) {
//                            countHowManyTimes++;
//                        }
//                    }
//
//                    if (shortestLength == 1) {
//                        if (countHowManyTimes == strs.length-1) {
//                            lettersInCommon = lettersInCommon + strs[i].charAt(timesCommon);
//                            countHowManyTimes = 0;
//                            timesCommon += 1;
//                        }
//                    }
//
//                    // length 3 and above
//                    if (countHowManyTimes == shortestLength) {
//                        lettersInCommon = lettersInCommon + strs[i].charAt(timesCommon);
//                        countHowManyTimes = 0;
//                        timesCommon += 1;
//                    }
//                }
//            }
//            return lettersInCommon;
//
//        }
//
//       // System.out.println(shortestLength);
//
//        for (int j = 0; j < shortestLength; j++) {
//            for (int i = 0; i < strs.length-1; i++) {
//                if (strs[i].charAt(j) == strs[i+1].charAt(j)) {
//                        countHowManyTimes++;
//                }
//
//                if (shortestLength == 1) {
//                    if (countHowManyTimes == strs.length-1) {
//                        lettersInCommon = lettersInCommon + strs[i].charAt(timesCommon);
//                        countHowManyTimes = 0;
//                        timesCommon += 1;
//                    }
//                }
//
//                // length 3 and above
//                if (countHowManyTimes == strs.length) {
//                    lettersInCommon = lettersInCommon + strs[i].charAt(timesCommon);
//                    countHowManyTimes = 0;
//                    timesCommon += 1;
//                }
//            }
//        }
//        return lettersInCommon;
//    }

}
