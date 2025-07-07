class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        
        int maxSum=arr[0];
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(sum>=0){
                sum=sum+arr[i];
            }else{
                sum=arr[i];
            }
            if(maxSum<sum){
                maxSum=sum;
            }
        }
        return maxSum;
        
        
    }
}