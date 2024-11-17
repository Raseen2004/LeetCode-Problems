class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1Str = version1.split("\\.");
        String[] v2Str = version2.split("\\.");

        for(int i=0;i<Math.max(v1Str.length,v2Str.length);i++){
            int v1 = i< v1Str.length ? Integer.parseInt(v1Str[i]):0;
            int v2 = i< v2Str.length ? Integer.parseInt(v2Str[i]):0;

            if(v1>v2){
                return 1;
            }
            if(v1<v2){
                return -1;
            }
        }
        return 0;
    }
}