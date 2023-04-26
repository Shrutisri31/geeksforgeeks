//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
     int ansIndex = 0;
     int count = 1; 
     for(int i=1 ; i<a.length;i++){
         if(a[i]==a[ansIndex]){
             count++;
         }
         else{
             count -- ;
         }
         if(count == 0){
             ansIndex=i;
             count = 1;
         }
     }
     //check if ansIndex is actually the answer 
     count = 0;
     for(int e:a){
        if(e == a[ansIndex]){
            count++;
        }     
       }
      if(count > size/2){
            return a[ansIndex];
        }
            return -1;
    }
}