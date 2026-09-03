class Solution:
    def reverse(self, start, end):
        prev, curr = None, start
        while curr != end:
            nxt = curr.next
            curr.next = prev
            prev = curr
            curr = nxt
        return prev

    def reverseKGroup(self, head, k):
        count, temp = 0, head
        while temp and count < k:
            temp = temp.next
            count += 1
        if count < k:
            return head

        new_head = self.reverse(head, temp)
        head.next = self.reverseKGroup(temp, k)
        return new_head


# -------------------------
# Example
# -------------------------

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def printList(head):
    while head:
        print(head.val, end=" ")
        head = head.next
    print()


# Example 1
head = ListNode(1)
head.next = ListNode(2)
head.next.next = ListNode(3)
head.next.next.next = ListNode(4)
head.next.next.next.next = ListNode(5)

k = 2

solution = Solution()
result = solution.reverseKGroup(head, k)

print("Example 1:")
print("Input:  1 -> 2 -> 3 -> 4 -> 5")
print("k = 2")
print("Output: ", end="")
printList(result)


# Example 2
head = ListNode(1)
head.next = ListNode(2)
head.next.next = ListNode(3)
head.next.next.next = ListNode(4)
head.next.next.next.next = ListNode(5)

k = 3

result = solution.reverseKGroup(head, k)

print("\nExample 2:")
print("Input:  1 -> 2 -> 3 -> 4 -> 5")
print("k = 3")
print("Output: ", end="")
printList(result)