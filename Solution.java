public class Solution {
    public int commonFactors(int a, int b) {
        int i = 1;
        int c = 0;
        while (i <= a) {
            if (a % i == 0 && b % i == 0) {
                c++;
            }
            i++;
        }
        return c;
    }
}
