class Solution {
    public int reverse(int x) {
        int temp = x;
        long sum = 0;
        if (x < 0) {
            x *= -1;
        }
        while (x > 0) {
            int r = x % 10;
            sum = sum * 10 + r;
            x /= 10;
        }
        if (temp < 0) {
            sum *= -1;
        }
        if (sum <= Integer.MAX_VALUE && sum >= Integer.MIN_VALUE) {
            return (int) sum;
        } else {
            return 0;
        }
    }
}