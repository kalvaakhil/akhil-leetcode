class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        n = len(s)
        ones = s.count('1')
        zeros = n - ones
        result = '1' * (ones - 1) + '0' * zeros + '1'
        return result
        