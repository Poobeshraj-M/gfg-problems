//https://neetcode.io/problems/max-consecutive-ones/question?list=allNC

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                c++;
                max=(max<c)?c:max;
            }
            else c=0;
        }
        return max;
    }
}
