// Last updated: 2/5/2026, 12:17:31 PM
1class Solution {
2    static class Trie{
3        class Node{
4            char ch;
5            String isterminal;
6            HashMap<Character,Node> child;
7            public Node(char ch){
8                this.ch=ch;
9                child=new HashMap<>();
10            }
11        } 
12        private Node root=new Node('*');
13        public void insert(String word){
14            Node curr = root;
15            for (int i = 0; i < word.length(); i++) {
16                char ch = word.charAt(i);
17                if (curr.child.containsKey(ch)) {
18                    curr = curr.child.get(ch);
19                } else {
20                    Node nn = new Node(ch);
21                    curr.child.put(ch, nn);
22                    curr = nn;
23                }
24            }
25            curr.isterminal = word;
26        }
27        public String search(String word) {
28		Node curr = root;
29		for (int i = 0; i < word.length(); i++) {
30			char ch = word.charAt(i);
31			if (curr.child.containsKey(ch)) {
32				curr = curr.child.get(ch);
33                if(curr.isterminal!=null){
34                    return curr.isterminal;
35                }
36			} else {
37				return word;
38			}
39		}
40		return word;
41	}
42        
43    }
44    public String replaceWords(List<String> dictionary, String sentence) {
45        Trie t = new Trie();
46        for(String s:dictionary){
47            t.insert(s);
48        }
49        String [] arr = sentence.split(" ");
50        StringBuilder sb = new StringBuilder();
51        for(int i=0; i<arr.length;i++){
52            String get=t.search(arr[i]);
53            sb.append(get+" ");
54        }
55        return sb.toString().trim();
56    }
57}