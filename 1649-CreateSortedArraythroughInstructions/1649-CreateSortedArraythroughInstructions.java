// Last updated: 2/3/2026, 10:59:56 PM
1class Solution {
2    public int[][] sortTheStudents(int[][] score, int k) {
3        int n= score[0].length;
4        int m= score.length;
5        HashMap<Integer,Integer> s = new HashMap();
6        PriorityQueue<Integer> pq = new PriorityQueue<>();
7        for(int i=0; i<m; i++){
8            s.put(score[i][k],i);
9            pq.add(score[i][k]);
10        }
11        int c=m-1;
12        int [][] result=new int [m][n];
13        while(!pq.isEmpty()){
14            int a = pq.poll();
15            int b = s.get(a);
16            for(int i=0; i<n; i++){
17                result[c][i]=score[b][i];
18            }
19            c--;
20        }
21        return result;
22    }
23}