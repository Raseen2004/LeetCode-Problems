class Solution {
    public long minimumSteps(String s) {
        long swap = 0;
        int black = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                swap += (long) black;
            } else {
                black++;
            }
        }

        return swap;
    }
}