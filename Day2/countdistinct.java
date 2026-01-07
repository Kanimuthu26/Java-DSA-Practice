// Platform: Leetcode
// Problem Statement: Count the distinct number on the board
// Complexity of the problem: Easy

class countdistinct {
    public int distinctIntegers(int n) {
        if(n==1)
        {
            return n;
        }
        int count=n-1;
        return count;
    }
}

/*
 * Problem Insight:
 * When a number n is written on the board, applying the operation with
 * all valid divisors results in values that eventually repeat.
 * 
 * For any n > 1, all generated values collapse into the range [1, n-1],
 * and 1 is always reachable since it divides every integer.
 * 
 * Therefore, the total number of distinct values that can appear on the
 * board is n - 1.
 * 
 * This allows the problem to be solved using direct mathematical reasoning
 * instead of simulation.
 */
