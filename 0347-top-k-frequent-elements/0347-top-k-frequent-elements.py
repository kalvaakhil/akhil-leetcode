class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        c = Counter(nums)
        c=dict(c)
        c = sorted(c.items(), key=lambda kv: kv[1],reverse=True)
        l=[]
        for i in range(k):
            l.append(c[i][0])
        return l