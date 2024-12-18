class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        int[] res = new int[set.size()];
        int k=0;
        for(int n: set){
            res[k++] = n;
        }

        return res;
    }
}