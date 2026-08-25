# LeetCode 19 - Remove Nth Node From End of List

This problem is about removing the Nth node from the end of a linked list.

### Example

**Input:**

```text
1 -> 2 -> 3 -> 4 -> 5
n = 2
```

**Output:**

```text
1 -> 2 -> 3 -> 5
```

### Approach

I used two pointers, `fast` and `slow`.

First, I move the `fast` pointer `n` steps ahead. Then I move both pointers together until `fast` reaches the end. This keeps `slow` just before the node that needs to be removed.

Finally, I skip that node using:

```java
slow.next = slow.next.next;
```

### Complexity

* Time: O(n)
* Space: O(1)

### Languages

* Java
* Python
