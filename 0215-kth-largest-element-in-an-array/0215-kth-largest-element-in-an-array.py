class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        l=nums.copy()
        l.sort()
        return l[-k]
        