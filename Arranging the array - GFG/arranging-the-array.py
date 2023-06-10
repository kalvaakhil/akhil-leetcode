
from typing import List


class Solution:
    def Rearrange(self, n : int, arr : List[int]) -> None:
        # code here
        def Rearrang( a, n):
            ne=[i for i in a if i<0]
            p=[i for i in a if i>=0]
            ne.extend(p)
            a[:]=ne[:]
            return a
        return Rearrang(arr,n)



#{ 
 # Driver Code Starts

class IntArray:
    def __init__(self) -> None:
        pass
    def Input(self,n):
        arr=[int(i) for i in input().strip().split()]#array input
        return arr
    def Print(self,arr):
        for i in arr:
            print(i,end=" ")
        print()


if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        n = int(input())
        
        
        arr=IntArray().Input(2)
        
        obj = Solution()
        obj.Rearrange(n, arr)
        
        print(*arr, end=' ')
        print()

# } Driver Code Ends