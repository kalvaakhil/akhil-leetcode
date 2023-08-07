class Solution:
   def vowelStrings(self, words: List[str], queries: List[List[int]]) -> List[int]:
    seen=set()
    n=len(words)
    freq=[0]*n
    vowels="aeiou"
    for i,v in enumerate(words):
        if(v[0] in vowels and v[-1] in vowels):
            freq[i]=1
    for i in range(1,n):
        freq[i]+=freq[i-1]
    print(freq)
    res=[]
    for i,j in queries:
        if(i>0 and j<n):
            res.append(freq[j]-freq[i-1])
        else:
            res.append(freq[j])
    return res