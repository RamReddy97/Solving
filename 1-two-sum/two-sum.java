class Solution {
    // below code is failing for case when duplicates like say array is 3,3 then result is 1,1 instead of 0,1
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
// for (int i = 0; i < nums.length; i++) {
//     map.put(nums[i], i);  // value → index
// }
//int[] numbers;

for(int i=0; i<nums.length;i++){
    int complement = target-nums[i];
    if(map.containsKey(complement))
    {
        return new int[]{map.get(complement),i};
    }
map.put(nums[i],i);
}
       // Arrays.sort(nums);
        // int k = nums.length;
        //  for(int i=0,  j = k-1;  i<j  ; )
        //  {
        //     if(nums[i]+nums[j] > target)
        //     {
        //        // i++;
        //     j--;
        //     }
        //    else if(nums[i]+nums[j] < target)
        //     {i++;}
        //     else
        //     {
        //         numbers = { map.get(nums[i]), map.get(nums[j])};
            
        //     return numbers;}
        // }
        return new int[]{0,0};
    }
}