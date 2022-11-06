class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;
        for(int i =0; i< arr.length;i++){
            if(largestNumber<arr[i]){
                largestNumber = arr[i];
            }
        }
        for(int i =0; i< arr.length;i++){
            if(largestNumber!=arr[i] && arr[i]>secondLargestNumber){
                secondLargestNumber = arr[i];
            }
        }
        
        if(secondLargestNumber == Integer.MIN_VALUE){
            return -1;
        }
        return secondLargestNumber;
        
    }
}