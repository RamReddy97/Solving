class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (h.containsKey(nums[i]))
                return true;
            else
                h.put(nums[i], i);
        }
        /*
        for(int i = 0; i< nums.length; i++)
        {
            for( int j = i+1; j< nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    return true;
                }
            
                
            }
        }*/
        return false;
    }
}