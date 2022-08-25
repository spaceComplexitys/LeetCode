class Solution {
    // O(n^2) time complexity
    // O(n) space complexity
    
    
    
    
    public int rob(int[] nums) {
    ArrayList<Integer> firstList = new ArrayList<>();
    ArrayList<Integer> secondList = new ArrayList<>();
    
    if (nums.length == 1) return nums[0];
    
    for (int i = 0; i < nums.length-1; i++) {
        firstList.add(nums[i]);
    }
    
    for (int i = 1; i < nums.length; i++) {
        secondList.add(nums[i]);
    }

        int firstRob = helper(firstList);
        int secondRob = helper(secondList);
        
        return firstRob > secondRob ? firstRob : secondRob;
       
      //  
    }
    
    
    private int helper(ArrayList<Integer> nums) {
    if (nums.size() == 0) return 0;
    int prev1 = 0;
    int prev2 = 0;
    for (int num : nums) {
        int tmp = prev1;
        prev1 = Math.max(prev2 + num, prev1);
        prev2 = tmp;
    }
    return prev1;
}
    
    
    // public int rob(int[] nums) {
    //     int n = nums.length;
    //     if(n == 1) return nums[0];
    //     int[] dp1 = new int[n + 2];
    //     // with first house
    //     for(int i = n - 2; i >= 0; i--){
    //         dp1[i] = Math.max(dp1[i + 1], nums[i] + dp1[i + 2]);
    //     }
    //     int[] dp2 = new int[n + 2];
    //     // without first house but with last house
    //     for(int i = n - 1; i > 0; i--){
    //         dp2[i] = Math.max(dp2[i + 1], nums[i] + dp2[i + 2]);
    //     }
    //     // In dp2 array we should take dp2[1] into consideration instead of dp2[0], because dp2[1] is the final ans for dp2.
    //     return Math.max(dp1[0], dp2[1]);
    // }
}

// 1,2,3 It is 3 because  1 and 3 are adjacent due to being in a circle-
// How to I keep track that nums[0] + nums[nums.length] will never happen