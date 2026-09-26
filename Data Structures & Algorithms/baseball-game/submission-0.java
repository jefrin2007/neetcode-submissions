class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> stack = new Stack<>();
       for(int i=0;i<operations.length;i++){
        String ops = operations[i];
        if(ops.equals("C")){
            stack.pop();
        }
        else if(ops.equals("D")){
            stack.push(stack.peek()*2);
        }
        else if(ops.equals("+")){
            int first = stack.pop();
            int second = stack.peek();
            stack.push(first);
            stack.push(first+second);
        }
        else{
            stack.push(Integer.parseInt(ops));
        }
       } 
       int total = 0;
       for(int sum : stack){
        total+=sum;
       }
       return total;
    }
}