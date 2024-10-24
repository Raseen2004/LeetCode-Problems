class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> map = new HashSet<>();
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            map.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (map.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}