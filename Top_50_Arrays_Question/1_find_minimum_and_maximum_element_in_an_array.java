class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
       return new pair(min,max);
    }
}

