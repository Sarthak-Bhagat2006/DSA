
import java.util.LinkedList;
import java.util.Queue;

class BipartiteGraph{
    //check if graph is bipartite
    /* Graph is bipartite when we can divide all nodes into two sets

    Acyclic graph is bipartite
    Even vertices cycle is bipartite
    Odd vertices cycle is bipartite
    */

    // Using BFS
    public static boolean isBipartite(int[][] graph) {
        int n = graph.length; //no. of nodes

        //  -1 = no color
        //  0 = red
        //  1 = blue
        int[] col = new int[n];
        //Initialie all node color to (no color)
        for(int i = 0; i < n; i++){
            col[i] = -1;
        }

        //if graph is not joined
        for(int i = 0; i < n; i++){
            if(col[i] == -1){
                if(!util(graph, i, col)){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean util(int graph[][], int curr, int[] col){
        Queue<Integer> q = new LinkedList<>();

        q.add(curr);
        col[curr] = 0;
        while(!q.isEmpty()){
            int u = q.remove();

            for(int v : graph[u]){
                if(col[v] == -1){
                    col[v] = (col[u] == 0) ? 1 : 0; 
                    q.add(v);
                }

                else if(col[v] == col[u]){
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args){
        int graph[][] = new int[][]{{1,2,3}, {0,2}, {0,1,3}, {0,2}};

        System.out.println(isBipartite(graph));
    }
}