LeetCode 49 - Group Anagrams

Approach: HashMap + Sorting

In this problem, I grouped words that contain the same letters. I sorted each word and used the sorted word as a key in a HashMap. If multiple words have the same key, they are added to the same group.

Time Complexity: O(n * k log k)

Space Complexity: O(n * k)

Languages: Python 3, Java
