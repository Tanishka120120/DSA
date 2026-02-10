import java.util.*;
public class graphs {
    /*0 — 1 — 2
      |   |
      3 — 4*/
static int V=5;
   static ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
    static void addedge(int u, int v){
      adj.get(u).add(v);
      adj.get(v).add(u);

    }
    static void bfs(int start){
        boolean[] visited= new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        visited[start]=true;
        q.offer(start);
        while (!q.isEmpty()) {
            int n=q.poll();
            System.out.println(n);
            for(int i:adj.get(n)){
                if(!visited[i]){
                    visited[i]=q.offer(i);
                }
            }
        }
    }

    static void dfs(int node, boolean[] visited){
        visited[node]=true;
        System.out.println(node);
        for(int i:adj.get(node)){
            if(!visited[i]){
                dfs(i, visited);
                
            }
        }
    }

    static boolean hascycle(int parent, int node, boolean[] visited){
        visited[node]=true;
        for(int i:adj.get(node)){
            if(!visited[i]){
                if(hascycle(i, node, visited)){
                 return true;
                }
                
            }
            else if (i!=parent){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        for(int i=0;i<V;i++){
          adj.add(new ArrayList<>());
        }
        addedge(0, 1);
        addedge(1, 2);
        addedge(0, 3);
        addedge(1, 4);
        addedge(3, 4);
        System.out.println(adj);
        bfs(2);
        System.out.println("0dfs");
        boolean[] visited=new boolean[V];
        dfs(4, visited);
        boolean k=hascycle(-1, 0, visited);
        System.out.println(k);
    }
}
