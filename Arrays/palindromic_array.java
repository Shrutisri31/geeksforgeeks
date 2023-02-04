class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i=0;i<a.length;i++){
                  //palindrome number 
                  int temp=a[i], rev=0, rem=0;
                  while(temp!=0){
                      rem = temp % 10;
                      rev = rev*10 + rem;
                      temp=temp/10;
                  }
                  if(a[i]!=rev){
                  return 0;
                  }
                 
               }
               return 1;
           }
}
