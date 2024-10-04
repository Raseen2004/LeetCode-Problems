class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder s = new StringBuilder();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch && count == 0) {
                s.append(word.charAt(i));
                s.reverse();
                count++;
            } else {
                s.append(word.charAt(i));
            }
        }

        return s.toString();
    }
}