// Last updated: 9/20/2025, 10:57:52 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<Integer> ll = new ArrayList<>();

        ll.add(intervals[0][0]);
        for(int i=0; i<intervals.length-1; i++){
            if(intervals[i][1]>=intervals[i+1][1]){
                intervals[i+1][1]=intervals[i][1];
            }
            if(intervals[i][1]>=intervals[i+1][0]){
                continue;
            }
            else{
                ll.add(intervals[i][1]);
                ll.add(intervals[i+1][0]);
            }
        }
        ll.add(intervals[intervals.length-1][1]);
        int [][]arr = new int [ll.size()/2][2];

        for(int i=0; i<ll.size(); i++){
            // arr[i][0]=ll.get(i);
            // arr[i][1]=ll.get(i+1);
            System.out.println(ll.get(i));
        }

        int a =0;
        for(int i=0; i<ll.size()/2; i++){
            arr[i][0]=ll.get(a);
            arr[i][1]=ll.get(a+1);
            a+=2;
        }
        return arr;

    }
}