class Solution {
    public int characterReplacement(String s, int k) {
        int finl=0;
        int r = 0;
        int l = 0;
        int cmax = 0;
        int[] arr = new int[26];
        while(r<s.length()){
            arr[s.charAt(r)-'A']++;
            cmax = Math.max(cmax,arr[s.charAt(r)-'A']);
            if((r - l +1) - cmax > k){
                arr[s.charAt(l)-'A']--;
                ++l;
            }
            if((r - l +1) - cmax <= k){
                finl = Math.max(finl,r-l+1);
                r++;
            }
        } 
        return finl;
    }
}