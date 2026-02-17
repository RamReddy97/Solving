class Solution {
    public int appendCharacters(String s, String t) {
        int c = 0; int i = 0; int j = 0;
        int slen = s.length();
        int tlen = t.length();
        while(i<slen && j<tlen)
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