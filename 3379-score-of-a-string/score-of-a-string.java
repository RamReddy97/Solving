class Solution {
    public int scoreOfString(String s) {
        int score = 0; 
        for(int k = 0; k<s.length() - 1; k++)
        {
            score = score + Math.abs((s.charAt(k) - s.charAt(k+1)));
        }
        return score;
    }
}