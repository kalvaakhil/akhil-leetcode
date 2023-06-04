class Solution:
    def semiOrderedPermutation(self, nums: List[int]) -> int:
        
        if nums[0] == 1 and nums[len(nums) - 1] == len(nums):
            return 0
        
        op = 0
        min_idx = nums.index(min(nums))
        max_idx = nums.index(max(nums))
        if min_idx < max_idx:
            op = min_idx + (len(nums) - 1 - max_idx)
        if min_idx > max_idx:
            op = min_idx + (len(nums) - 1 - max_idx) - 1
        
        return op