# Your task is to complete this function

class Solution:
    def matrixDiagonally(self,mat):
        n=len(mat)
        d={}
        for i in range(n):
            for j in range(n):
                if i+j not in d:
                    d[i+j]=[]
                d[i+j].append(mat[i][j])
        ans=[]
        for key in d:
            if key%2==0:
                ans.extend(d[key][::-1])
            else:
                ans.extend(d[key])
        return ans


#{ 
 # Driver Code Starts
# Driver Program
if __name__=='__main__':
    t = int(input())
    for i in range(t):
        n = list(map(int, input().strip().split()))
        arr = list(map(int, input().strip().split()))
        matrix = [[0 for i in range(n[0])]for j in range(n[0])]
        k=0
        for i in range(n[0]):
            for j in range(n[0]):
                matrix[i][j] = arr[k]
                k+=1
        a = Solution().matrixDiagonally(matrix)
        for x in a:
            print(x,end=' ')
        print('')
# Contributed by: Harshit Sidhwa
# } Driver Code Ends