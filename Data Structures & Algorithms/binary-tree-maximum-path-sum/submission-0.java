class Solution {
    int mxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        sum(root);
        return mxSum;
    }
    private int sum(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = Math.max(0,sum(node.left));
        int right = Math.max(0,sum(node.right));
        int currSum = node.val+left+right;
        mxSum = Math.max(currSum,mxSum);
        return  node.val+Math.max(left,right);
    }
}
