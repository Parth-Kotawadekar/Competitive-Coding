class Solution {
    public int strStr(String haystack, String needle) {
        //Solved
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}