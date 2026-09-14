class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null ){
            return res;
        }
        Queue<TreeNode> qe = new LinkedList<>();
        qe.add(root);
        while(!qe.isEmpty()){
            int size = qe.size();
            int last = 0;
            for(int i =0;i<size;i++){
                TreeNode curr = qe.poll();
                last = curr.val;
                if(curr.left != null ) qe.offer(curr.left);
                if(curr.right != null) qe.offer(curr.right);
            }
            res.add(last);
        }
        return res;
    }
}
