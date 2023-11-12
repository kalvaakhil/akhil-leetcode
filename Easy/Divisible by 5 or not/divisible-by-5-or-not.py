#User function Template for python3

class Solution:

    def isDivisibleBy5(self, Bin):
        Bin=int(Bin,2)
        Bin=str(Bin)[::-1]
        if (Bin[0]=='0' or Bin[0]=='5'):
            return "Yes"
        else:
            return "No"


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':

    t = int(input())

    for _ in range(t):
        Bin = input()

        solObj = Solution()

        print(solObj.isDivisibleBy5(Bin))
# } Driver Code Ends