class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int low=0;
        int high=a.length-1;
        int mid=0,temp=0;
        while(mid<=high){
          switch(a[mid]){
              case 0:{
                  temp = a[low];
                  a[low]=a[mid];
                  a[mid]=temp;
                  low++;
                  mid++;
                  break;
              }
              case 1:{
                  mid++;
                  break;
              }
              case 2:{
                  temp=a[high];
                  a[high]=a[mid];
                  a[mid]=temp;
                  high--;
                  break;
              }
                  
          }            
        }
        
    }
}