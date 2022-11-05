class Solution {
    static int maxGroupSize(int[] arr, int N, int K) {
        // code here
        
        
        int rem[]= new int[K];
        for(int i=0 ;i<N ;i++){
            rem[arr[i] % K]++;
        }
        
        int ans = 0;
        for(int i=0; i<=K/2 ; i++){
            if(i==0 || i==K-i){
                if(rem[i]!=0)
                ans++;
            }
            else
            ans += Math.max(rem[i] ,rem[K-i]);
        }
        return ans;
    }
};
