#User function Template for python3

class Solution:
    def isPossible(self, n, m, s):
        # code here
        l=r=u=d=0
        lr=0
        ud=0
        for i in s:
            if i=='L':
                lr-=1
                if lr<l:
                    l=lr
            if i=='R':
                lr+=1
                if lr>r:
                    r=lr
            if i=='U':
                ud+=1
                if ud>u:
                    u=ud
            if i=='D':
                ud-=1
                if ud<d:
                    d=ud
        
        if r-l+1>m or u-d+1>n:
            return 0
        else:
            return 1


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n, m = [int(x) for x in input().split()]
        s = input()
        
        ob = Solution()
        print(ob.isPossible(n, m, s))
# } Driver Code Ends