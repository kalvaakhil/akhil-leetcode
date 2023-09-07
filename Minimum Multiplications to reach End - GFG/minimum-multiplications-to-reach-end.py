#User function Template for python3

from collections import deque
from typing import List
 
class Solution:
    
    def minimumMultiplications(self, arr : List[int], start : int, end : int) -> int:
        if start == end:
            return 0
        q = deque()
        mod = 100000
        q.append([start%mod,0])
        visist = set()
        visist.add(start)
        while q:
            oldstart,step = q.popleft()
            if oldstart == end:
                return step
            for x in arr:
                nextstart =  (oldstart*x)%mod
                if nextstart not in visist:
                    q.append([nextstart,step+1])
                    visist.add(nextstart)
        return -1


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=="__main__":
    for _ in range(int(input())):
        n = int(input())
        arr = [int(x) for x in input().strip().split()]
        start, end = list(map(int,input().split()))
        obj=Solution()
        print(obj.minimumMultiplications(arr, start, end))
# } Driver Code Ends