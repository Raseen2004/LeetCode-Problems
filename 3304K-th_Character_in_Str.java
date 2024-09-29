class Solution {
    public char kthCharacter(int k) {
        String word = "a";

        while (word.length() < k) {
            StringBuilder newWord = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char nextC = (char) ((word.charAt(i) - 'a' + 1) % 26 + 'a');
                newWord.append(nextC);
            }
            word += newWord.toString();
        }

        return word.charAt(k - 1);
    }
}