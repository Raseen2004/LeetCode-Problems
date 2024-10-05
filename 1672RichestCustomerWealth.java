class Solution {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> sumArr = new ArrayList<>();

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            sumArr.add(sum);
        }
        return Collections.max(sumArr);

    }
}