
class Solution
{
    public void countOddEven(int[] arr, int n)
    {
        // Code here
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else if(arr[i]%2!=0){
                odd++;
            }
        }
       System.out.println(odd + " " + even);
    }
}