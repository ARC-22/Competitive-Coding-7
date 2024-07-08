// Time Complexity : O(nlog n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

public class Solution {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: the minimum number of conference rooms required
     */
    public int minMeetingRooms(List<Interval> intervals) {
        // Write your code here
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> e=new PriorityQueue<>();
        for(int[] interval:intervals)
        {
            e.add(interval[1]);
        }
        for(int[] interval:intervals)
        {
            if(interval[0]>=e.peek())
                e.poll();
        }
        return e.size();   
    }
}