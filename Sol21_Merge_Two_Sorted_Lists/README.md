LeetCode 21 - Merge Two Sorted Lists

Problem

Given two sorted linked lists, merge them into one sorted linked list.

Approach

I used a dummy node to make the merging easier.

- Compare the values of both lists.
- Add the smaller value to the new list.
- Move that list forward.
- Continue until one list becomes empty.
- Add the remaining nodes to the end.

Example

Input:

list1 = [1,2,4]
list2 = [1,3,4]

Output:

[1,1,2,3,4,4]

Complexity

- Time: O(n + m)
- Space: O(1)

Solutions are available in Java and Python.
