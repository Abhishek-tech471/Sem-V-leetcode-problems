// Last updated: 2/8/2026, 1:34:45 AM
1class Solution {
2    public int maximumNumberOfStringPairs(String[] words) {
3        HashSet<String> isvisited = new HashSet<>();
4        int c=0;
5        for(int i =0; i<words.length;i++){
6            String a =""+words[i].charAt(1)+words[i].charAt(0);
7            System.out.println(a);
8            if(isvisited.contains(a)){
9                isvisited.remove(words[i]);
10                c++;
11            }
12            // else if( ){
13            //     c++;
14            //     isvisited.remove((words[i].charAt(1)+words[i].charAt(0)) );
15            // }
16            else{
17                isvisited.add(words[i]);
18            }
19        }
20        return c;
21    }
22}