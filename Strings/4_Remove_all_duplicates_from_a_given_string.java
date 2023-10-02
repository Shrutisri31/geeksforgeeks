//brute force approach
class Solution {
    String removeDuplicates(String str) {
        // code here
       char[] s  = str.toCharArray();
       int index = 0;
       for(int i=0; i<s.length; i++){
           //check wheter s[i] is present before or not 
           //if present then do nothing
           int j;
           for(j=0; j<i; j++){
             if(s[i] == s[j]){
               break;
             }
           }
          
           
           //if present 
           if( i == j){
               s[index++] = s[i];
           }
          
       }
       return String.valueOf(Arrays.copyOf(s,index));
    }
}

//Hashing Approach
class Solution {
  String removeDuplicates(String str) {
        // code here
    HashSet<Character> set = new HashSet<>();
    String ans = "";
    for(int i=0; i<str.length(); i++)
    {
        if(!set.contains(str.charAt(i)))
        {
            ans = ans + str.charAt(i);
        }
        set.add(str.charAt(i));
      }
    
    return ans;
    }
}