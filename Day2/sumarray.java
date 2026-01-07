//sum of 1d array
// Platform=Leetcode
// Complexity of the problem: Easy
class sumarray {
    public int[] runningSum(int[] nums) {
        int len=nums.length;
        int[] n1=new int[len];
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<=i;j++)
            {
                n1[i]+=nums[j];
            }
        }
        return n1;
    }
}
// Main function is already written in the leetcode platform
