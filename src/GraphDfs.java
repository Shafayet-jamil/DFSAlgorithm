import java.util.ArrayList;
import java.util.Stack;

public class GraphDfs {
    public int vertex;
    public ArrayList<ArrayList<Integer>> adj;
    public GraphDfs(int vertex){
        this.vertex = vertex;
        adj = new ArrayList<>();//initialize the adj list then give the value using loops
        for(int i=0; i<=vertex; i++){
            adj.add(new ArrayList<>());
        }


    }
    public void addEdge(int source,int destination){
        adj.get(source).add(destination);
//        adj.get(destination).add(source);
    }
    public void printGraph(){
        for(int i=0; i<vertex; i++){
            System.out.print("Vertex "+(i)+ "--> ");
//            for(int j = 0; i<adj.get(i).size(); j++){
//                System.out.print(adj.get(i).get(j)+" ");
//            }
            for(int neighbor : adj.get(i)){
                System.out.print(neighbor + " ");

            }
            System.out.println();
        }

    }
//    do using stack in dfs
    public void dfsAlgo(int start){
        boolean[] visited = new boolean[vertex];
        doDfs(start,visited);
//        Stack<Integer>stack = new Stack<>();
//        visited[start] = true;
//        stack.push(start);
//        while(!stack.isEmpty()){
//            int current = stack.pop();
//            System.out.println("Current vertex: "+current+" ");
//            for(int neighbor : adj.get(current)){
//                if(!visited[neighbor]){
//                    stack.push(neighbor);
//                    visited[neighbor] = true;
//                }
//            }
//        }

    }

    public void doDfs(int start, boolean[] visited){
        visited[start] = true;
        System.out.println("Vertex Visited --> "+(start));
        for(int neighbor : adj.get(start)){
            if(!visited[neighbor]){
                doDfs(neighbor, visited);
            }
        }

    }
}
