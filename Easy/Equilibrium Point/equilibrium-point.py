# User function Template for python3

# User function Template for python3
# User function Template for python3

class Solution:
    # Complete this function
    
    #Function to find equilibrium point in the array.
    def equilibriumPoint(self,A, n):
        # Your code here
        rsum=sum(A)
        lsum=0
        for i in range(n):
            rsum-=A[i]
            if i!=0:
                lsum+=A[i-1]
            if lsum==rsum:
                return i+1
        return -1



#{ 
 # Driver Code Starts
# Initial Template for Python 3

import math


def main():

    T = int(input())

    while(T > 0):

        N = int(input())

        A = [int(x) for x in input().strip().split()]
        ob=Solution()

        print(ob.equilibriumPoint(A, N))

        T -= 1


if __name__ == "__main__":
    main()

# } Driver Code Ends