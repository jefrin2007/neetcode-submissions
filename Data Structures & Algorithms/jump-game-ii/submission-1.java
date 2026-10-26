class Solution {
    public int jump(int[] nums) {
        int Totaljump = 0;
        int destination = nums.length-1;
        int coverage = 0;
        int lastjump = 0;
        if(nums.length == 1) return 0;
        for(int i=0;i<nums.length;i++){
            coverage = Math.max(coverage,i+nums[i]);
            if(i==lastjump){
                lastjump = coverage;
                Totaljump++;
                if(coverage>=destination){
                    return Totaljump;
                }
            }
        }
        return Totaljump;
    }
}
