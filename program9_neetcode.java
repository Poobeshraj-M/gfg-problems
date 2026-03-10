//https://neetcode.io/problems/is-subsequence/history?list=allNC&submissionIndex=1

class Solution {
    public boolean isSubsequence(String s, String t) {
        int l=0;
        int n=t.length();
        int i=0;
        while(i<n && l<s.length())
        {
            if(s.charAt(l)==t.charAt(i))
            {
                l++;
            }
            i++;
        }
        return l==s.length();
    }
}
