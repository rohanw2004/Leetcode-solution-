LeetCode 26 - Remove Duplicates from Sorted Array

Approach

I used two pointers "i" and "j". Since the array is already sorted, I compare the current element with "nums[j]". If it is different, I move "j" forward and store the new element there.

At the end, "j + 1" gives the number of unique elements.

Complexity

- Time: O(n)
- Space: O(1)
