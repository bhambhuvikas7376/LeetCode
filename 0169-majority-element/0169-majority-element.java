class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            if(map.containsKey(n))
            {
                map.put(n,map.get(n)+1);
            }
            else map.put(n,1);
        }
        int ans=0;
        Set<Integer> keys=map.keySet();
        for(Integer key:keys)
        {
            if(map.get(key)>(nums.length/2))
            {
                ans=key;
                break;
            }
        }

        return ans;
        
    }
}