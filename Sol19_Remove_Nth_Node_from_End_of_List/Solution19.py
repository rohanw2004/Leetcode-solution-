from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        ptr = temp = head
        for _ in range(n):
            ptr = ptr.next
            
        if not ptr:
            return head.next
            
        while ptr.next:
            ptr = ptr.next
            temp = temp.next
            
        temp.next = temp.next.next
        return head


# Example:
# Input: 1 -> 2 -> 3 -> 4 -> 5
# n = 2
# Output: 1 -> 2 -> 3 -> 5

head = ListNode(1)
head.next = ListNode(2)
head.next.next = ListNode(3)
head.next.next.next = ListNode(4)
head.next.next.next.next = ListNode(5)

n = 2

obj = Solution()

print("Input:", end=" ")

temp = head
while temp:
    print(temp.val, end="")
    if temp.next:
        print(" -> ", end="")
    temp = temp.next

head = obj.removeNthFromEnd(head, n)

print("\nOutput:", end=" ")

temp = head
while temp:
    print(temp.val, end="")
    if temp.next:
        print(" -> ", end="")
    temp = temp.next