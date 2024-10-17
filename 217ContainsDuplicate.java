class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet();
        for(int n: nums){
            boolean dup = map.add(n); 
            if(!dup) {
                return true;
            }
        }
        return false;
    }
}