class Solution:
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        arr.sort(reverse=True)
        diff = arr[0]-arr[1]
        for i in range(1,len(arr)-1):
            if diff!=arr[i]-arr[i+1]:
                return False
        return True
                    
        
        