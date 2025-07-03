class Solution {
    public boolean increasingTriplet(int[] nums) {

        int minimum = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

        for(int n : nums){
            if(n <= minimum) minimum = n;
            else if(n <= mid) mid = n;
            else return true;
        }
        return false;
        
    }
}