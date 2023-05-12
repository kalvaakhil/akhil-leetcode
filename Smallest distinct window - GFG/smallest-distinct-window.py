#User function Template for python3
class Solution:
    def findSubString(self, str):
        dict={}
        ans=1e9
        j=0
        for i in str:
            if i not in dict:
                dict[i]=0
        length=len(dict)
        
        for i in range(len(str)):
            dict[str[i]]+=1
            if dict[str[i]]==1:
                length-=1
            
            while length==0:
                ans=min(ans,i-j+1)
                dict[str[j]]-=1
                if dict[str[j]]==0:
                    length+=1
                j+=1
                
        return ans 

    
    
    


#{ 
 # Driver Code Starts
#Initial Template for Python 3


def main():

    T = int(input())

    while(T > 0):
    	str = input()
    	ob=Solution()
    	print(ob.findSubString(str))
    	
    	T -= 1


if __name__ == "__main__":
    main()

# } Driver Code Ends