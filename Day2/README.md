# Day 2 – Problem Solving

## Overview

On Day 2, I focused on solving two fundamental problems using logical reasoning and basic mathematical insights. The emphasis was on understanding the core idea behind each problem rather than relying on brute-force simulation.

---

## Problem 1: Count Distinct Numbers on the Board

### Problem Summary

Given an integer `n` written on a board, certain operations are performed based on divisibility rules. The task is to determine how many **distinct numbers** can appear on the board after applying all valid operations.

### Key Insight

* For any integer `n > 1`, every valid operation reduces the number to a smaller value.
* The number `1` is always reachable since `1` divides every integer.
* All possible values eventually fall within the range `1` to `n - 1`.

### Conclusion

The total number of distinct numbers that can appear on the board is:

```
n - 1
```

This problem can be solved efficiently using mathematical observation instead of simulation.

---

## Problem 2: Running Sum of an Array

### Problem Summary

Given an integer array, return a new array where each element represents the **running sum** up to that index.

### Example

**Input:**

```
[1, 1, 1]
```

**Output:**

```
[1, 2, 3]
```

### Approach

* Start with a cumulative sum initialized to `0`.
* Traverse the array from left to right.
* Add the current element to the cumulative sum.
* Store the cumulative sum at each index.

### Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(1) (excluding output array)

---

## Learnings

* Identifying patterns can significantly reduce problem complexity.
* Mathematical reasoning often leads to optimal solutions.
* Simple array traversal problems help reinforce fundamentals.

---
