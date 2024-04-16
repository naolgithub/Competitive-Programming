# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        currentNode=head
        nextNode=None
        previousNode=None
        while currentNode is not None:
            #nextNode holds next node
            nextNode=currentNode.next
            
            #connecting current node to previous node
            currentNode.next=previousNode
            
            #updating previous node to the current node
            previousNode=currentNode
            
            #updating current node to the next node
            currentNode= nextNode
            
        return previousNode
        