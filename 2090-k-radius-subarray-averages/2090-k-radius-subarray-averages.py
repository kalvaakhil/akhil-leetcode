class Solution:
    def getAverages(self, nums: List[int], k: int) -> List[int]:
        n = len(nums)
        result = [-1]*n
        if k*2 >= n:
            return result
        s= [0]
        for i in nums:
            s.append(s[-1] + i)
        for i in range(k, n - k):
            result[i] = (s[i+k+1] - s[i-k]) // (k*2+1)
        return result
        