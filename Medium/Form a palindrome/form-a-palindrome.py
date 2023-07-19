#User function Template for python3

class Solution:
    def lcs(self,a,b):
        m=len(a)
        n=len(b)
        t=[[0 for i in range(n+1)] for j in range(m+1)]
        for i in range(1,m+1):
            for j in range(1,n+1):
                if a[i-1]==b[j-1]:
                    t[i][j]=1+t[i-1][j-1]
                else:
                    t[i][j]=max(t[i][j-1],t[i-1][j])
        return t[m][n]
                    
    def findMinInsertions(self, s):
        lps=self.lcs(s,s[::-1])
        return len(s)-lps
        # code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        
        S = input().strip()
        ob=Solution()
        print(ob.findMinInsertions(S))
# } Driver Code Ends