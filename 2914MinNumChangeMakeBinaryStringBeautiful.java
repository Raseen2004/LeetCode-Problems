class Solution {
    public int minChanges(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i += 2) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);
            if (first != second) {
                c++;
            }
        }

        return c;
    }
}