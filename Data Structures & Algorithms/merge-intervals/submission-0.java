class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] last = res.get(res.size()-1);
            int currstart = intervals[i][0];
            int currend = intervals[i][1];
            if(last[1]>=currstart){
                last[1]= Math.max(last[1],currend);
            }
            else{
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
