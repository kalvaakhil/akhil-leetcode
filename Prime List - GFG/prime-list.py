from typing import Optional

"""

Definition for singly Link List Node
class Node:
    def __init__(self,x):
        self.data=x
        self.next=None

You can also use the following for printing the link list.
printList(node)
"""
import math
class Solution:
    def primeList(self, head : Optional['Node']) -> Optional['Node']:
        # code here
        def newprime(n):
            i=n
            j=n
            while(not (isprime(i) or isprime(j))):
                i-=1
                j+=1
            if (isprime(i)): return i
            return j
        
        def isprime(n):
            if n<=1:
                return False
            for i in range(2,int(math.sqrt(n))+1):
                if n%i==0:
                    return False
            return True   

        temp=head
        while(temp):
            temp.data=newprime(temp.data)
            temp=temp.next
        return head
        



#{ 
 # Driver Code Starts
class Node:
    def __init__(self,x):
        self.data=x
        self.next=None

def printList(node):
    while (node != None):
        print(node.data,end=" ")
        node = node.next
    print()
def inputList():
    n=int(input())#lenght of link list
    data=[int(i) for i in input().strip().split()]#all data of linked list in a line
    head = Node(data[0])
    tail = head;
    for i in range(1,n):
        tail.next = Node(data[i]);
        tail = tail.next;
    return head;

if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        head = inputList()
        
        obj = Solution()
        res = obj.primeList(head)
        
        printList(res)
        

# } Driver Code Ends