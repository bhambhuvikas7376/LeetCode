class Solution {
    public int removeElement(int[] nums, int val) {
    int count=0;
    int j=nums.length-1;
        
      for(int i=0;i<nums.length;i++)
       {
          if(nums[i]==val) count++;  
      }
        
    for(int i=0;i<nums.length-count;i++)
       {
           if(nums[i]==val && nums[j]!=val)
           {
               int temp=nums[i];
               nums[i]=nums[j];
               nums[j]=temp;
           }
        else if (nums[i]==val && nums[j]==val)
        {
          j=j-1;
          i=i-1;  
        }
        else continue;
        
       }
        
        return nums.length-count;
    }
}