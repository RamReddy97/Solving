class Solution {
    public int[] getConcatenation(int[] nums) {

        int l = nums.length;
        int[] ans = new int[2 * l];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % l];
        }

        return ans;
    }

    /* older code ie my own

     int l = nums.length;
        int[] ans = new int[2 * l ];
        for (int i = 0; i < ans.length; i++) {

            if (i >= l)    // idea is to remove this if else conditions as it takes time to check these
                ans[i] = nums[i - l];
            else
                ans[i] = nums[i];
        }
        return ans;
        
    */
}
