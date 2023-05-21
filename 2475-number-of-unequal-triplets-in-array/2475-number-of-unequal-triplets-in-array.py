class Solution:
    def unequalTriplets(self, nums: List[int]) -> int:
        c = Counter(nums)
        #print(c)
        ans = 0
        left = 0
        right = len(nums)
        for _, val in c.items():
            right -= val
            ans+= left*val*right
            left+=val
        return ans