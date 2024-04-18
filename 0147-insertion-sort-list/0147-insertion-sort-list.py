# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def insertionSortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head
        cur = head


        while cur and cur.next:
            if cur.val <= cur.next.val:
                cur = cur.next
            else:
                lesser_element = dummy
                while lesser_element.next.val < cur.next.val:
                    lesser_element = lesser_element.next

                temp = cur.next
                cur.next = temp.next
                temp.next = lesser_element.next
                lesser_element.next = temp

        return dummy.next