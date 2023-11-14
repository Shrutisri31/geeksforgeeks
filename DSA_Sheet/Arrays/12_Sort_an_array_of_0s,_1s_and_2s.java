// Better Approach for sort 0,1,2
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int cnt0 = 0, cnt1 = 1, cnt2 = 2;
        for(int i=0; i<a.length; i++){
            if(a[i] == 0){
                cnt0++;
            }
            else if(a[i] == 1){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }
        
        for(int i=0; i<cnt0; i++){
            a[i] = 0;
        }
        for(int i=cnt0; i< cnt0+cnt1 ; i++){
            a[i] = 1;
        }
        for(int i=cnt0+cnt1; i<cnt0+cnt1+cnt2; i++){
            a[i] = 2;
        }
    }
}

// Problem with this code is that TC - O(2N) and ques tells it to do in TC - O(N),SC-O(1) 
// for solving this problem by Optimal approach of Dutch National flag Algorithm
