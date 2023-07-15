#User function Template for python3

'''

class Node:
    def __init__(self, data):   # data -> value stored in node
        self.data = data
        self.next = None
'''

class Solution:
    def addOne(self,head):
        head=self.reverse(head)
        curr=head
        carry=1
        while curr:
            curr.data+=carry
            carry=curr.data//10
            curr.data%=10
            
            if not carry:
                break
            
            curr=curr.next
        
        
        head=self.reverse(head)
        if carry:
            newNode=Node(1)
            newNode.next=head
            head=newNode
        return head
            
            
    def reverse(self,head):
        prev=None
        while head:
            Next=head.next
            head.next=prev
            prev=head
            head=Next
        return prev




#{ 
 # Driver Code Starts
#Initial Template for Python 3

# Node Class
class Node:
    def __init__(self, data):   # data -> value stored in node
        self.data = data
        self.next = None

# Linked List Class
class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    # creates a new node with given value and appends it at the end of the linked list
    def insert(self, value):
        if self.head is None:
            self.head = Node(value)
            self.tail = self.head
        else:
            self.tail.next = Node(value)
            self.tail = self.tail.next

def PrintList(head):
    while head:
        print(head.data,end='')
        head = head.next

if __name__ == '__main__':
    t=int(input())
    for _ in range(t):
        
        num = input()
        ll = LinkedList() # create a new linked list 'll1'.
        for digit in num:
            ll.insert(int(digit))  # add to the end of the list
        
        resHead = Solution().addOne(ll.head)
        PrintList(resHead)
        print()


# } Driver Code Ends