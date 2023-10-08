#User function Template for python3

'''
class Node:
    def __init__(self):
        self.data = None
        self.next = None
'''

class Solution:
    def splitList(self, head,head1,head2):
        if not head:
            return None, None

        slow = head
        fast = head

        # Finding the mid
        while fast.next != head and fast.next.next != head:
            slow = slow.next
            fast = fast.next.next

        # Initialize head1 and head2 as None
        head1 = None
        head2 = None

        # If there is only one node in the circular list
        if slow == head:
            head1 = head
        else:
            # Point the start of the first half to head1
            head1 = head
            # Point head2 to the mid's next
            head2 = slow.next

            # Make the first half circular
            slow.next = head

            # Check if the original list has an even or odd number of elements
            if fast.next == head:
                fast.next = head2
            else:
                fast.next.next = head2

        return head1, head2


#{ 
 # Driver Code Starts
#Initial Template for Python 3


class Node:
    def __init__(self):
        self.data = None
        self.next = None

def printCircularLinkedList(head):
    tmp = head
    while True:
        print(tmp.data, end = " ")
        tmp = tmp.next
        if tmp == head:
            break
    print()
    
if __name__ == "__main__":
    for i in range(int(input())):
        head = Node()
        head1 = Node()
        head2 = Node()
        tmp = head
        n = int(input())
        for i in input().split():
            tmp.next = Node()
            tmp = tmp.next
            tmp.data = int(i)
        head = head.next
        tmp.next = head
        obj = Solution()
        head1,head2 = obj.splitList(head,head1,head2)
        printCircularLinkedList(head1)
        printCircularLinkedList(head2)


# } Driver Code Ends