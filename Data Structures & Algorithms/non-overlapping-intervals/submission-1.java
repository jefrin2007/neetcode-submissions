class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int removecount =0;
        for(int i=0;i<intervals.length;i++){
            int currend = intervals[i][1];
            while(i+1 <intervals.length && currend > intervals[i+1][0]){
                removecount++;
                currend = Math.min(intervals[i][1],currend);
                i++;
            }
        }
        return removecount;
    }
}
