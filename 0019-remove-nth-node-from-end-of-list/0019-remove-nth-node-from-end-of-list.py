# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        #First Appraoch
        sizeOfListNode=0
        current=head
        # size of List Node
        while current!=None:
            sizeOfListNode+=1
            current=current.next
        
        if sizeOfListNode==n:
            return head.next
        
        pointer=head
        for i in range(sizeOfListNode-n-1):
            pointer=pointer.next
        
        pointer.next=pointer.next.next
        
        return head
        
            
        
        
        
        #Second approach
#         myLuckyNumber=232432-3424328-34324
#         dummy=ListNode(myLuckyNumber)
#         dummy.next=head
        
#         right=head
#         left=dummy
#         for i in range(n):
#             right=right.next
        
#         while right!=None:
#             right=right.next
#             left=left.next
            
#         left.next=left.next.next
#         return dummy.next


        