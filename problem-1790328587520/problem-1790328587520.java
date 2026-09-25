// Last updated: 25/09/2026, 14:59:47
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
12    public ListNode removeElements(ListNode head, int val) {
13        while(head!=null && head.val==val){
14            head=head.next;
15        }
16        ListNode n =head;
17        while(n!=null && n.next!=null){
18            if(n.next.val==val){
19                n.next=n.next.next;
20            }
21            else{
22                n=n.next;
23            }
24            
25        }
26        return head;
27    }
28}