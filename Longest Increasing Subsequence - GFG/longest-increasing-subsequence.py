#User function Template for python3

class Solution:
    def help(self,tail,x):
        l=0
        r = len(tail)-1
        while l<r:
            m = l+(r-l)//2
            if tail[m]>=x:
                r = m
            else:
                l = m+1
        return r
    def longestSubsequence(self,arr,n):
        # code here
        tail = [arr[0]]
        for i in range(1,n):
            if arr[i]>tail[-1]:
                tail.append(arr[i])
            else:
                c = self.help(tail,arr[i])
                tail[c] = arr[i]
        return len(tail)
       



#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    for _ in range(int(input())):
        n = int(input())
        a = [ int(x) for x in input().split() ]
        ob=Solution()
        print(ob.longestSubsequence(a,n))
# } Driver Code Ends