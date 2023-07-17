#User function Template for python3

class Solution:

    def removeKdigits(self, S, K):
        # code here
        li = []
        for ele in S:
            if li and li[-1] > ele:
                while K and li and li[-1] > ele:
                    li.pop()
                    K -= 1
                li.append(ele)
            
            else:
                li.append(ele)
        
        if K:
            while K:
                li.pop()
                K -= 1
                
        x = "".join(li)
        x = x.lstrip('0')
        if len(x) == 0:
            return 0
        
        return x


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':

    t = int(input())

    for _ in range(t):
        S = input()
        K = int(input())

        obj = Solution()

        ans = obj.removeKdigits(S, K)

        print(ans)


# } Driver Code Ends