class Solution {
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int countVowelSubstrings(String word) {
        int n = word.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            HashSet<Character> set = new HashSet();
            for (int j = i; j < n; j++) {
                if (!isVowel(word.charAt(j)))
                    break;
                set.add(word.charAt(j));
                if (set.size() == 5) {
                    res++;
                }
            }
        }

        return res;
    }

}