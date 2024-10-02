class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0)
            return arr;

        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);

        HashMap<Integer, Integer> HM = new HashMap<>();

        int rank = 1;
        for (int n : sortArr) {
            if (!HM.containsKey(n)) {
                HM.put(n, rank++);
            }
        }

        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = HM.get(arr[i]);
        }

        return res;
    }
}