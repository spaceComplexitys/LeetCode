class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        
        # Init hashmap
        numDict = {}
        for i in nums:
            numDict[i] = None
        for i in numDict:
            if i+1 in numDict:
                numDict[i] = i+1;
                

        countDict = {}
        
        def counter(num):
            if num == None:
                return 0;
            if num in countDict:
                return countDict[num]
            countDict[num] = 1
            
            countDict[num] += counter(numDict[num])
            
            return countDict[num]
        
        largest = 0
        for i in nums:
            largest = max(largest, counter(i))
        return largest
       
            
        