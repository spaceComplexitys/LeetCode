import java.util.HashMap;

public class CheckInclusion {
    public static void main(String[] args) {
        CheckInclusion checkInclusion = new CheckInclusion();
        String s1 = "ab";
        String s2 = "eidboaoo";
        checkInclusion.checkInclusion(s1, s2);
    }

//    public boolean checkInclusion(String s1, String s2) {
//        if (s2.contains(s1)) {
//            return true;
//        }
//
//        String reverse = new StringBuilder(s2).reverse().toString();
//
//        if (reverse.contains(s1) ) {
//            return true;
//        }
//
//        return false;
//    }

    public static boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> mapS1 = new HashMap<>();
        // this will be static map which will be set only once
        for(char c : s1.toCharArray()){
            mapS1.put(c,mapS1.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> mapS2 = new HashMap<>();
        int windowStart = 0;
        for(int windowEnd = 0; windowEnd<s2.length();windowEnd++){
            char c = s2.charAt(windowEnd);
        // add to second map
            mapS2.put(c,mapS2.getOrDefault(c,0)+1);
        // check if total iteration are equal to number of character in string S1, so we can start check for permutation
            if(windowEnd+1>=s1.length()){
        // if both maps are equlas, return true
                if(mapS1.equals(mapS2)){
                    return true;
                }
        // If not equal then subtract / remove the leftest character from mapS2
                char leftChar = s2.charAt(windowStart++);
                mapS2.put(leftChar, mapS2.get(leftChar)-1 );
                if(mapS2.get(leftChar)==0){
                    mapS2.remove(leftChar,0);
                }
            }
        }
        return false;
    }

}

