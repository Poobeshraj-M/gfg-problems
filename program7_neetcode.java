//https://neetcode.io/problems/is-anagram/history?list=allNC&submissionIndex=1

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int arr1[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr1[(int)s.charAt(i)-97]++;
            arr1[(int)t.charAt(i)-97]--;
        }
        for(int i:arr1)
        {
            if(i!=0) return false;
        }
        return true;
    }
}
