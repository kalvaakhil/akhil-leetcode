class Solution:
    def waysToSplitArray(self, nums: List[int]) -> int:
        sumtot= sum(nums)-nums[0]
        leftsum = nums[0]
        res = 0
        for i in range(1,len(nums)):
            if leftsum>=sumtot:
                res+=1
            sumtot-=nums[i]
            leftsum+=nums[i]   
        return res
        