import math
class Solution:
    def findPrefixScore(self, nums: List[int]) -> List[int]:
        ans=[]
        lst=0
        mx=-(math.inf)
        for i in range(len(nums)):
            if(nums[i]>mx):
                mx=nums[i]
            lst+=nums[i]+mx
            ans.append(lst)
        return ans
            