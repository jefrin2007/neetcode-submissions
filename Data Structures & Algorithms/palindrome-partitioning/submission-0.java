class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtracking(s,0,new ArrayList<>(),res);
        return res;
    }
    public void backtracking(String s,int st,List<String> curr,List<List<String>> res){
        if(st == s.length()){
            res.add(new ArrayList<>(curr));
        }
        for(int end = st;end<s.length();end++){
            if(isPalindrome(s,st,end)){
                String part = s.substring(st,end+1);
                curr.add(part);
                backtracking(s,end+1,curr,res);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
