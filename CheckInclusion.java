public class CheckInclusion {
    public static void main(String[] args) {
        CheckInclusion checkInclusion = new CheckInclusion();
        String s1 = "ab";
        String s2 = "eidboaoo";
        checkInclusion.checkInclusion(s1, s2);
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s2.contains(s1)) {
            return true;
        }

        String reverse = new StringBuilder(s2).reverse().toString();

        if (reverse.contains(s1) ) {
            return true;
        }

        return false;
    }

}
