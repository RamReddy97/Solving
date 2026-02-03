class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            /*In a HashMap:
            
            containsKey() is O(1) (instant). It uses a mathematical formula to go straight to the location.
            containsValue() is O(n). loop has to go through every single value in the map to find a match.
            Because we are calling containsValue() (O(n)) inside a loop (O(n)), your total time complexity becomes O(n²).  */
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