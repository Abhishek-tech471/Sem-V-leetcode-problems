// Last updated: 10/16/2025, 11:45:15 AM
class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<BipartitePair> q= new LinkedList<>();
        HashMap<Integer,Integer> visited = new HashMap<>();
        for(int i=0; i<graph.length;i++){
            if(visited.containsKey(i)){
                continue;
            }
            q.add(new BipartitePair(i,0));
            while(!q.isEmpty()){
            // 1
                BipartitePair r = q.poll();
            // 2
                if(visited.containsKey(r.vtx)){
                    if(visited.get(r.vtx)!=r.dis){
                        return false;
                    }
                    continue;
                }
            // 3
                visited.put(r.vtx,r.dis);
            // 4
                
            // 5
            for(int nbrs: graph[r.vtx]){
                if(!visited.containsKey(nbrs)){
                    q.add(new BipartitePair(nbrs, r.dis+1));
                }
            }
        }
        }
        return true;

        

    }

    class BipartitePair{
        int vtx;
        int dis;
        public BipartitePair(int vtx ,int dis){
            this.vtx=vtx;
            this.dis=dis;
        }
    }
}