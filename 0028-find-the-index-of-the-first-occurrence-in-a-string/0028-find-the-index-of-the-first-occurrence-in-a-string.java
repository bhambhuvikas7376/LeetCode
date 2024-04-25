class Solution {
    public int strStr(String haystack, String needle) {
        int ans=0;
        int count=0;
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
            count=0;
            if(needle.charAt(0)==haystack.charAt(i))
            {
                for(int k=i,j=0;j<needle.length();k++,j++)
                {
                    if(needle.charAt(j)==haystack.charAt(k))
                    {
                        count++;
                        
                    }
                }
                
                if(count==needle.length())
                {
                    ans=i;
                    break;
                }
            }
            
            
        }

        if(count==needle.length()) return ans;
        else return -1;
        
    }
}