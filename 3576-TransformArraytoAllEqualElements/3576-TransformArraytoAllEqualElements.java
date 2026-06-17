// Last updated: 17/06/2026, 13:37:58
1class Solution {
2    public boolean canMakeEqual(int[] arr, int k) {
3        int n =arr.length;
4        boolean ans = true;
5        boolean ans1=false;
6        int [] arr1 = new int [n];
7        for(int i=0; i<n; i++){
8            arr1[i]=arr[i];
9        }
10        int a=k;
11        for(int i=0; i<n-1; i++){
12            if(arr[i]==1){
13                System.out.println(arr[i]);
14                continue;
15            }
16            else{
17                if(k>0){
18                    arr[i]=arr[i]*-1;
19                    arr[i+1]=arr[i+1]*-1;
20                    k--;
21                }
22                else{
23                    ans= false;
24                    break;
25                }
26            }
27        }
28        if(arr[n-1]==1){
29            ans1= true;
30        }
31        else{
32            ans1= false;
33        }
34        k=a;
35        boolean ans3 = true;
36        boolean ans4=false;
37        for(int i=0; i<n-1; i++){
38            if(arr1[i]==-1){
39                System.out.println(arr[i]);
40                continue;
41            }
42            else{
43                if(k>0){
44                    arr1[i]=arr1[i]*-1;
45                    arr1[i+1]=arr1[i+1]*-1;
46                    k--;
47                }
48                else{
49                    ans3= false;
50                    break;
51                }
52            }
53        }
54        if(arr1[n-1]==-1){
55            ans4= true;
56        }
57        else{
58            ans4= false;
59        }
60
61        return (ans && ans1) || (ans3 && ans4);
62    }
63}