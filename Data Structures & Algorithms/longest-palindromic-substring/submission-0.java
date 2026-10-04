class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        String res = "";
        for(int i=0;i<s.length();i++){
            String odd = check(s,i,i);
            if(odd.length()>res.length()){
                res = odd;
            }
            String even = check(s,i,i+1);
            if(even.length()>res.length()){
                res = even;
            }
        }
        return res;
    }
    private String check(String s,int left ,int right){
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}
