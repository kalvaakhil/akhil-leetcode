#User function Template for python3
import math
import collections
from collections import Counter
def LargButMinFreq(arr,n):
    #code here
    c=dict(Counter(arr))
    c=sorted(c.items(),key=lambda x:x[1])
    y=c[0][1]
    mx=-math.inf
    for i in c:
        if(i[1]==y):
            mx=max(mx,i[0])
        else:
            break
    return mx


#{ 
 # Driver Code Starts
#Initial Template for Python 3

t = int(input())
#Iterating over test cases
for _ in range(t):
    n = int(input())
    arr = [int(x) for x in input().split()]
    print(LargButMinFreq(arr, n))
# } Driver Code Ends