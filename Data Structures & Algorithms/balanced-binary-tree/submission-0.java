class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int leftheg = height(root.left);
        int rightheg = height(root.right);
        if(Math.abs(leftheg - rightheg)>1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return 1+Math.max(left,right);
    }
}
