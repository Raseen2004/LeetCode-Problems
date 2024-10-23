class Solution {
    public char findTheDifference(String s, String t) {
        int i=0,ch=0;
        while(i<s.length()){
            ch += (int)t.charAt(i);
            ch -= (int)s.charAt(i);
            i++;
        }
        ch += (int)t.charAt(i);
        
        return (char)ch;
    }
}