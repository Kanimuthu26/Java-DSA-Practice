/*
 * Problem: Java String Compare
 * Platform: HackerRank
 *
 * Description:
 * Given a string s and an integer k, generate all possible substrings
 * of length k from s and determine the lexicographically smallest
 * and largest substrings.
 *
 * Approach:
 * 1. Initialize both smallest and largest with the first substring of length k.
 * 2. Traverse the string from index 0 to (s.length() - k).
 * 3. Extract each substring of length k.
 * 4. Use compareTo() to:
 *    - Update smallest if the current substring is smaller.
 *    - Update largest if the current substring is larger.
 * 5. Print the smallest and largest substrings.
 *
 * Time Complexity:
 * O(n * k) where n is the length of the string.
 *
 * Space Complexity:
 * O(k) for storing substrings.
 *
 * Key Concepts Used:
 * - String substring()
 * - Lexicographical comparison using compareTo()
 * - Loop traversal
 */


import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        for(int i=0;i<=s.length()-k;i++)
        {
            String curr=s.substring(i,i+k);
            if(curr.compareTo(smallest)<0)
            {
                smallest=curr;
            }
            if(curr.compareTo(largest)>0)
            {
                largest=curr;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
