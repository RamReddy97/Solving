class Solution {
    public int longestConsecutive(int[] nums) {

        /**sort the array
        then check for consecutive, if its broken then add the count to a new array, then in this way for all sequences i will have counts populated in new array
        then find max of the arraylist using inbuilt function max without needing to sort --> i got from ai this part  */
        Arrays.sort(nums);
        int max = nums.length;
        int count = 1;
        if(max==0)
        return 0;
        
        ArrayList<Integer> s = new ArrayList<>(); 
        for(int i =1; i<max;i++)
        {
        //  if(i==max-1)
        //     s.add(count);   
             if(nums[i] > nums[i-1] && nums[i]  == nums[i - 1]+ 1)
            {
                count =  count + 1;
                if(i==max-1)
                s.add(count);
                
            }
             else if( (nums[i] > nums[i-1] && nums[i]  != nums[i - 1]+ 1) )
            {
                if(count>1)
                s.add(count);
              //  System.out.println(":s"+s);
                count = 1;
            }
            else if( i == max-1)
            s.add(count);
            //return count;
        }
       
       if (!s.isEmpty()) {
       int highest = Collections.max(s); 
       return highest; }
     else
        return  count ;
    }
}