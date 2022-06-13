class Solution {
    public void reverseString(char[] s) {
    
        int indexChange = 0;
        int length = s.length-1;
        
        if (s.length % 2 != 0) {
            indexChange = 1;
        }
        
        for (int i = 0; i < (s.length/2)+indexChange; i++) {
            char firstTemp = 0;
            char secondTemp = 0;

            firstTemp = s[i];
            secondTemp = s[length];

            s[i] = secondTemp;
            s[length] = firstTemp;
            length--;

        }
    }
}