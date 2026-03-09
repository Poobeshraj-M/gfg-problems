//https://neetcode.io/problems/duplicate-integer/question?list=allNC

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums)
        {
            set.add(n);
        }
        return nums.length==set.size()?false:true;
        
    }
}
