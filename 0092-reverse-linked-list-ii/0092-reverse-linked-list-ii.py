# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseBetween(self, head, left, right):
        dummy=ListNode(0)
        dummy.next=head
        pointer=dummy
        current=head
        for i in range(left-1):
            pointer=current
            current=current.next

        prev=None
        for i in range(right-left+1):
            nextNode=current.next
            current.next=prev
            prev=current
            current=nextNode
            
        pointer.next.next=current
        pointer.next=prev
        return dummy.next