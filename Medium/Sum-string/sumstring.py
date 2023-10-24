#User function Template for python3
class Solution:
    def isSumString (self,s):
        def check(j, mi, li, s, n):
            fi = li - mi
            if fi < 0:
                return 0
            for k in range(j-1, -1, -1):
                if int(s[k:j]) == fi:
                    if k == 0:
                        return 1
                    return check(k, fi, mi, s, n )
            return 0
        def _isSumString(s, n):
            for i in range(n-1, -1, -1):
                li = int(s[i:])
                for j in range(i-1, -1, -1):
                    mi = int(s[j:i])
                    if mi > li:
                        break
                    if check(j, mi, li, s, n) == 1:
                        return 1 
            return 0 
        if s[0] == '0':
            s = s[1:]
        return _isSumString(s, len(s))


#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        
        S=str(input())

        ob = Solution()
        
        print(ob.isSumString(S))
# } Driver Code Ends