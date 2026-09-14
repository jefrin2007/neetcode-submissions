public class Codec {
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root,sb);
        return sb.toString();
    }
    private void buildString(TreeNode root,StringBuilder sb){
        if(root == null){
            sb.append("null,");
            return;
        }
        sb.append(root.val).append(",");
        buildString(root.left,sb);
        buildString(root.right,sb);
    }
    public TreeNode deserialize(String data) {
        String[] val = data.split(",");
        Queue<String> qe = new LinkedList<>();
        for(String num : val){
            qe.offer(num);
        }
        return builtTree(qe);
    }
    private TreeNode builtTree(Queue<String> qe){
        String val = qe.poll();
        if(val.equals("null")){
            return null;
        }
        TreeNode  node = new TreeNode(Integer.parseInt(val));
        node.left = builtTree(qe);
        node.right = builtTree(qe);
        return node;
    }
}
