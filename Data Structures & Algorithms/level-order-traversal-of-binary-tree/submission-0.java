class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> qe = new LinkedList<>();
        qe.add(root);
        while(!qe.isEmpty()){
            int size = qe.size();
            List<Integer> temp = new ArrayList<>();
            for(int i =0;i<size;i++){
                TreeNode curr = qe.poll();
                temp.add(curr.val);
                if(curr.left != null){
                    qe.add(curr.left);
                }
                if(curr.right != null){
                    qe.add(curr.right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}
