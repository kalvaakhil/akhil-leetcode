#User function Template for python3
class Solution:
    def nextGreatest(self,arr, n):
        max_value = -1  # Initialize the maximum value
        for i in range(n - 1, -1, -1):
            temp = arr[i]  # Store the current element in a temporary variable
            arr[i] = max_value  # Assign the maximum value seen so far to the current element
            max_value = max(max_value, temp)  # Update the maximum value if necessary


#{ 
 # Driver Code Starts
#Initial Template for Python 3



if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ob.nextGreatest(arr, n)
        for x in arr:
            print(x, end=" ")
        print()
        tc -= 1

# } Driver Code Ends