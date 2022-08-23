class Solution(object):
    def maxSubArray(self, nums):
        r = nums[0]
        largest = nums[0]
        for i in range(1, len(nums)):
            if r < 0:
                if nums[i] > r:
                    r = nums[i]
                else:
                    r += nums[i]
            else:
                r += nums[i]
            largest = max(largest,r)
        return largest
                
            
        