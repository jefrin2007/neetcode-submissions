class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> inOrderMap = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inOrderMap.put(inorder[i],i);
        }
        return splitTree(preorder,inOrderMap,0,0,inorder.length-1);
    }
    private TreeNode splitTree(int[] preorder,Map<Integer,Integer> inOrderMap,
    int rootIndex,int left,int right){
        TreeNode root = new TreeNode(preorder[rootIndex]);
        int mid = inOrderMap.get(preorder[rootIndex]);
        if(left<mid){
            root.left = splitTree(preorder,inOrderMap,rootIndex+1,left,mid-1);
        }
        if(right>mid){
            root.right = splitTree(preorder,inOrderMap,rootIndex+mid-left+1,mid+1,right);
        }
        return root;
    }
}
