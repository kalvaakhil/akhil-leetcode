class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        l=[i for i in range(1,n+1)]
        res=[]
        for i in combinations(l,k):
            res.append(list(i))
        return res
        