// Path algorithm.
import java.util.*;
import java.lang.*;
import java.io.*;
 
 
class ShortestPath
{
    final static int INF = 99999; // V = 4;
 
    void floydWarshall(int graph[][],int n)
    {
        int dist[][] = new int[n][n];
        int i, j, k;
        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
                dist[i][j] = graph[i][j];
 
        for (k = 0; k < V; k++)
        {
            
            for (i = 0; i < V; i++)
            {
              
                for (j = 0; j < V; j++)
                {
                  
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
 
        printSolution(dist);
    }
 
    void printSolution(int dist[][])
    {
        System.out.println("Following matrix is the soln");
        for (int i=0; i<V; ++i)
        {
            for (int j=0; j<V; ++j)
            {
                if (dist[i][j]==INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j]+"   ");
            }
            System.out.println();
        }
    }
 
  
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("enter the no of nodes");
        n=in.nextInt();
        int graph[][] = new int[50][50]
        System.out.println("enter the graph");
        for(int i=1;i<n;i++)
        {
        for(int j=1;j<n;j++)
        {
        graph[i][j]=in.nextInt();
        }
        }
        
        ShortestPath a = new ShortestPath();
        a.floydWarshall(graph,n);
    }
}
 
