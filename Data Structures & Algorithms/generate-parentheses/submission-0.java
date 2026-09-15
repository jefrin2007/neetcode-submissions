class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtracking(n,0,0,new StringBuilder(),res);
        return res;
    }
    private void backtracking(int n, int open,int close,StringBuilder curr,List<String> res){
        if(open==n && close == n){
            res.add(curr.toString());
            return;
        }
        if(open<n){
            curr.append('(');
            backtracking(n,open+1,close,curr,res);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<open){
            curr.append(')');
            backtracking(n,open,close+1,curr,res);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}
