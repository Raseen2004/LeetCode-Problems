class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuffer s2 = new StringBuffer(s);

        for(int i=0;i<s.length();i++) {
            s2.delete(indices[i], indices[i]+1);
            s2.insert(indices[i], s.charAt(i));
        }

        return s2.toString();
    }
}