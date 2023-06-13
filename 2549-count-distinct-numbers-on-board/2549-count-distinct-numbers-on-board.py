class Solution:
    def distinctIntegers(self, n: int) -> int:
        c=0
        if(n==1 or n==2):
            return 1
        for i in range(n):
            for j in range(1,n):
                if((n-i)%j==1):
                    print((n-i),j)
                    c+=1
                    break
        return c
            