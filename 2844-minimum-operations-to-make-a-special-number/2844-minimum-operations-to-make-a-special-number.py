class Solution:
    def minimumOperations(self, num: str) -> int:
        n, num = len(num), num[::-1]
        ans = n - ("0" in num) 
        for i in range(n):
            if i > ans: break
            if num[i] in "05":
                for j in range(i+1,n):
                    if (num[j] + num[i] in {"00", "25", "50", "75"}):
                        ans = min(ans, j-1)
        return ans
        