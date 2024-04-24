class Solution {
    public boolean isPalindrome(String s) {
    s=s.toLowerCase();    
    s=s.replaceAll("[^a-zA-Z0-9]","");
    boolean ans=true;
    for(int i=0,j=s.length()-1;i<j;i++,j--)
    {
        if(s.charAt(i)!=s.charAt(j)) 
        {
           ans=false;
           break;
        }
    }
        return ans;
    }   
}