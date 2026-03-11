//https://neetcode.io/problems/length-of-last-word/question

class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ') c++;
            else break;
        }
        return c;
    }
}
