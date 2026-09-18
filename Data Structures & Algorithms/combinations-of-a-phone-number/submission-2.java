class Solution {
    String[] phone = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length() == 0){
            return res;
        }
        backtracking(digits,0,"",res);
        return res;
    }
    public void backtracking(String digits,int idx,String curr,List<String> res){
        if(idx == digits.length()){
            res.add(curr);
            return;
        }
        int digit = digits.charAt(idx)-'0';
        String letters = phone[digit];
        for(int i=0;i<letters.length();i++){
            char letter = letters.charAt(i);
            backtracking(digits,idx+1,curr+letter,res);
        }
    }
}
