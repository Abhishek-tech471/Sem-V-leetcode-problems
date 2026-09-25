// Last updated: 25/09/2026, 19:12:52
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public int[] nextLargerNodes(ListNode head) {
13        List<Integer> value = new ArrayList<>();
14        while(head!=null){
15            value.add(head.val);
16            head=head.next;
17        }
18        int n =value.size();
19        int arr []=new int [n];
20        Stack<Integer> stack = new Stack<>();
21        for(int i=0; i<n; i++){
22            while(!stack.isEmpty() && value.get(stack.peek())<value.get(i)){
23                arr[stack.pop()]=value.get(i);
24            }
25            stack.push(i);
26        }
27        return arr;
28    }
29    
30}