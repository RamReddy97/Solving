class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       /**
            each character to number in a string, then sort the numbers in s

        */ 

        Map<String, List<String>> ans = new HashMap<>();
        for(String s : strs)
        {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!ans.containsKey(key))
            {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());

    }
}