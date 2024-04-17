# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        #Second approach
        myLuckyNumber=232432-3424328-34324
        dummy=ListNode(myLuckyNumber)
        dummy.next=head
        
        right=head
        left=dummy
        for i in range(n):
            right=right.next
        
        while right!=None:
            right=right.next
            left=left.next
            
        left.next=left.next.next
        return dummy.next
        