 
import java.util.Scanner;
 
class MST
{
    // Number of vertices in the graph
    //private static final int V=5
    int minKey(int key[], Boolean mstSet[])
    {
        
        int min = 999, min_index=-1;
 
        for (int v = 0; v < V; v++)
            if (mstSet[v] == 0 && key[v] < min)
            {
                min = key[v];
                min_index = v;
            }
 
        return min_index;
    }
 
  
    void printMST(int parent[], int n, int graph[][])
    {
        System.out.println("Edge   Weight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i]+" - "+ i+"    "+
                               graph[i][parent[i]]);
    }
 
    void primMST(int graph[][],int n)
    {
        
        int parent[] = new int[n];
        int key[] = new int [n];
        int mstSet[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }
        
        key[0] = 0;                             
        parent[0] = -1; 
 
        
        for (int count = 0; count < n-1; count++)
        {
            int u = minKey(key, mstSet);
            mstSet[u] = 1;
            for (int v = 0; v < n;v++)
                if (graph[u][v]!=0 && mstSet[v] == false &&
                    graph[u][v] <  key[v])
                {
                    parent[v]  = u;
                    key[v] = graph[u][v];
                }
        }
 
        printMST(parent, V, graph);
    }
 
    public static void main (String[] args)
    {
     
        MST t = new MST();
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("enter the no of nodes");
        n=in.nextInt();
        int graph[][] = new int[n][n];
        System.out.println("enter the tree");
        for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=n;j++)
          {
            graph[i][j]=in.nextInt();
          }
        }
 
        // Print the solution
        t.primMST(graph,n);
    }
}
