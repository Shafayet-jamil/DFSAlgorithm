
public class Main {
    public static void main(String[] args) {
           GraphDfs dfs = new GraphDfs(5);
           dfs.addEdge(1, 2);
           dfs.addEdge(1, 3);
           dfs.addEdge(1, 4);
           dfs.addEdge(0, 1);
           dfs.addEdge(3, 1);
           dfs.addEdge(2, 4);
           dfs.addEdge(0, 3);

           dfs.addEdge(5, 2);
           dfs.addEdge(5, 3);
           dfs.addEdge(4, 1);
           dfs.addEdge(4, 2);

           dfs.printGraph();
           dfs.dfsAlgo(2);

    }
}