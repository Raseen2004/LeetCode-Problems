class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> map = new HashMap();
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < secret.length(); i++) {
            char sChar = secret.charAt(i);
            char gChar = guess.charAt(i);

            if (sChar == gChar) {
                bulls++;
            } else {
                map.put(sChar, map.getOrDefault(sChar, 0) + 1);
            }
        }

        for (int i = 0; i < secret.length(); i++) {
            char sChar = secret.charAt(i);
            char gChar = guess.charAt(i);
            if (sChar != gChar && map.containsKey(gChar) && map.get(gChar) > 0) {
                cows++;
                map.put(gChar, map.get(gChar) - 1);
            }
        }

        return bulls + "A" + cows + "B";
    }
}