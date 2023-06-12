class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        result = []
        i = 0
        while i < len(nums):
            temp = [nums[i]]
            j = i + 1
            while j < len(nums) and nums[j] - nums[j - 1] == 1:
                temp[1:] = [nums[j]]
                j += 1
            result.append('->'.join(map(str, temp)))
            i = j
        return result
            