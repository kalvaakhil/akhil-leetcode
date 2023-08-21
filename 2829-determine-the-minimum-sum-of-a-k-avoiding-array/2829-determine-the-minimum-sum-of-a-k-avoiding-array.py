class Solution:
    def minimumSum(self, n: int, k: int) -> int:
        arr=[]
        i=0
        while 1:
            i+=1
            if(len(arr)==n):
                break
            if(k-i in arr):
                continue
            else:
                arr.append(i)
        return sum(arr)