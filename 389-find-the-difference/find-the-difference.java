class Solution {
    public char findTheDifference(String s, String t) {
        long sum = 0, difference = 0;

        for(char c : t.toCharArray()){
            sum += c - 'a';
        }
        for (char c : s.toCharArray()){
            difference += c - 'a';
        }

        return (char) (sum - difference + 'a');
    }
}