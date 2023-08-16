class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        queue = collections.deque()
        res = []
        for i, num in enumerate(nums):
            if len(queue) > 0 and i-k+1 > queue[0][1]:
                queue.popleft()
            while len(queue) > 0 and queue[-1][0] <= num:
                queue.pop()
            queue.append((num, i))
            if i >= k-1:
                res.append(queue[0][0])
        return res