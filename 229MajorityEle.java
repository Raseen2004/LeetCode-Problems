class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList();
        HashMap<Integer, Integer> map = new HashMap();
        int hold = nums.length / 3;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int ele = entry.getKey();
            int c = entry.getValue();
            if (c > hold) {
                res.add(ele);
            }
        }

        return res;
    }
}