class Solution {
    public int appendCharacters(String s, String t) {
        int c = 0; int i = 0; int j = 0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i) == t.charAt(j))
            {
                c++;
                i++;
                j++;
            }
            else
            i++;
        }
        return t.length()-c;
    }
}