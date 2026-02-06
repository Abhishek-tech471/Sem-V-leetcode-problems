// Last updated: 2/7/2026, 1:22:21 AM
1class Solution {
2    public int minNumberOfFrogs(String croakOfFrogs) {
3        int no=1;
4        HashMap<Character,Integer> map=new HashMap<>();
5        map.put('c',0);
6        map.put('r',0);
7        map.put('o',0);
8        map.put('a',0);
9        map.put('k',0);
10        int max=0;
11        for(int i=0; i<croakOfFrogs.length();i++){
12            if(croakOfFrogs.charAt(i)=='c'){
13                if((map.get('c')-map.get('k'))>max){
14                    max=map.get('c')-map.get('k');
15                    map.put('c',map.get('c')+1);
16                    no++;
17                }
18                else{
19                    map.put('c',map.get('c')+1);
20                }
21            }
22            if(croakOfFrogs.charAt(i)=='r'){
23                if(map.get('c')<=map.get('r')){
24                    return -1;
25                }
26                else{
27                    map.put('r',map.get('r')+1);
28                }
29            }
30            if(croakOfFrogs.charAt(i)=='o'){
31                if(map.get('r')<=map.get('o')){
32                    return -1;
33                }
34                else{
35                    map.put('o',map.get('o')+1);
36                }
37            }
38            if(croakOfFrogs.charAt(i)=='a'){
39                if(map.get('o')<=map.get('a')){
40                    return -1;
41                }
42                else{
43                    map.put('a',map.get('a')+1);
44                }
45                
46            }
47            if(croakOfFrogs.charAt(i)=='k'){
48                if(map.get('a')<=map.get('k')){
49                    return -1;
50                }
51                else{
52                    map.put('c',map.get('c')-1);
53                    map.put('r',map.get('r')-1);
54                    map.put('o',map.get('o')-1);
55                    map.put('a',map.get('a')-1);
56                }
57            }
58        }
59
60        if(map.get('c')==map.get('r') &&  map.get('r') == map.get('o') && map.get('o')==map.get('a') && map.get('a')==map.get('k')){
61            return no;
62        }
63        else{
64            return -1;
65        }
66    }
67}