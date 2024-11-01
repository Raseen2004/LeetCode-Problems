class Solution {
    public String losingPlayer(int x, int y) {
        int qt = y / 4;
        int c = 0;
        while (x > 0 && qt > 0) {
            x--;
            qt--;
            c++;
        }
        return (c % 2 == 0) ? "Bob" : "Alice";
    }
}