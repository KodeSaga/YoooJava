class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int sol = 0;
        for (int i=0; i<n; i++)
            for(int j=i+1; j<=n; j++)
                if(isUnique(s, i, j)){
                    sol = sol > (j-i) ? sol : j-i;}
        return sol;
    }
    
    public boolean isUnique(String s, int a, int b) {
        Set<Character> set = new HashSet<>();
        for(int i=a; i<b; i++){
            Character c = s.charAt(i);
            if(set.contains(c)) return false;
            set.add(c);
        }
        return true;
    }
        
}
